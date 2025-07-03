package me.loaforc.docgen

import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element

fun main() {
    val doc = parseXmlFile("doc.xml")
    val (types, properties, enumValues) = parseMembers(doc)

    assignPropertiesToTypes(types, properties)
    assignEnumsToTypes(types, enumValues)

    val outputDir = File("generated")
    outputDir.mkdirs()

    for (type in types.values.sortedBy { it.name }) {
        val markdown = generateMarkdownForType(type)
        val fileName = type.name.split('.').last() + ".md"
        File(outputDir, fileName).writeText(markdown)
    }

    generateVitepressStuff(outputDir)
}

fun parseXmlFile(path: String): org.w3c.dom.Document {
    val file = File(path)
    val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file)
    doc.documentElement.normalize()
    return doc
}

fun parseMembers(doc: org.w3c.dom.Document): Triple<MutableMap<String, ConditionType>, List<Pair<String, ConditionProperty>>, Map<String, List<EnumValue>>> {
    val members = doc.getElementsByTagName("member")
    val types = mutableMapOf<String, ConditionType>()
    val properties = mutableListOf<Pair<String, ConditionProperty>>()
    val enumValues = mutableMapOf<String, MutableList<EnumValue>>()

    for (i in 0 until members.length) {
        val member = members.item(i) as Element
        val nameAttr = member.getAttribute("name")

        when {
            nameAttr.startsWith("T:") -> {
                val typeName = nameAttr.removePrefix("T:")
                val summary = member.getElementsByTagName("summary").item(0)?.textContent?.trim() ?: ""
                val soundApiId = (member.getElementsByTagName("soundapi").item(0) as? Element)
                    ?.getElementsByTagName("id")?.item(0)?.textContent ?: continue // ignore. it's not a condition
                types[typeName] = ConditionType(typeName, summary, soundApiId)
            }

            nameAttr.startsWith("P:") -> {
                val (typeName, property) = parseProperty(member, nameAttr)
                properties.add(typeName to property)
            }

            nameAttr.startsWith("F:") -> {
                val (enumType, value) = parseEnumValue(member, nameAttr)
                enumValues.computeIfAbsent(enumType) { mutableListOf() }.add(value)
            }
        }
    }

    return Triple(types, properties, enumValues)
}

fun parseProperty(member: Element, nameAttr: String): Pair<String, ConditionProperty> {
    val parts = nameAttr.removePrefix("P:").split('.')
    val typeName = parts.dropLast(1).joinToString(".")
    val propName = parts.last()
    val example = member.getElementsByTagName("example").item(0)?.textContent
    val default = member.getElementsByTagName("default").item(0)?.textContent

    val typeText = (member.getElementsByTagName("value").item(0) as? Element)
        ?.getElementsByTagName("see")?.item(0)?.let { it as? Element }
        ?.getAttribute("cref")?.removePrefix("T:")?.split('.')?.last() ?: "Unknown"

    return typeName to ConditionProperty(propName, typeText, example, default)
}

fun parseEnumValue(member: Element, nameAttr: String): Pair<String, EnumValue> {
    val parts = nameAttr.removePrefix("F:").split('.')
    val enumType = parts.dropLast(1).joinToString(".")
    val valueName = parts.last().lowercase()
    val summary = member.getElementsByTagName("summary").item(0)?.textContent?.trim() ?: ""
    return enumType to EnumValue(valueName, summary)
}

fun assignPropertiesToTypes(types: MutableMap<String, ConditionType>, properties: List<Pair<String, ConditionProperty>>) {
    for ((typeName, prop) in properties) {
        types[typeName]?.properties?.add(prop)
    }
}

fun assignEnumsToTypes(types: MutableMap<String, ConditionType>, enumValues: Map<String, List<EnumValue>>) {
    for ((fullEnumName, values) in enumValues) {
        val parentType = fullEnumName.split('.').dropLast(1).joinToString(".")
        val shortEnumName = fullEnumName.split('.').last()
        types[parentType]?.enums?.put(shortEnumName, EnumType(shortEnumName, values))
    }
}

fun generateMarkdownForType(type: ConditionType): String {
    val builder = StringBuilder()
    val classDisplay = type.name.split('.').last().replace(Regex("([a-z])([A-Z])"), "$1 $2")

    builder.appendLine("## $classDisplay")
    builder.appendLine("${type.summary}\n")

    for ((enumName, enumType) in type.enums.toSortedMap()) {
        builder.appendLine("### $enumName")
        val sortedVals = enumType.values.sortedBy { it.name }
        for (valItem in sortedVals) {
            builder.appendLine("- `${valItem.name}`: ${valItem.summary}")
        }
        builder.appendLine()
    }

    builder.appendLine("### Properties")
    builder.appendLine("| Name | Type | Default |")
    builder.appendLine("|--------|-------|---------|")
    val sortedProps = type.properties.sortedBy { it.name }
    for (prop in sortedProps) {
        val linkedType = if (type.enums.containsKey(prop.type)) {
            "[${prop.type}](#${prop.type.lowercase()})"
        } else prop.type
        builder.appendLine("| ${prop.name} | $linkedType | ${prop.default ?: "N/A"} |")
    }

    builder.appendLine("\n### Usage")
    builder.appendLine("```json")
    builder.appendLine("{")
    builder.appendLine("    \"type\": \"${type.soundApiId}\",")
    if (sortedProps.isNotEmpty()) {
        val first = sortedProps.first()
        builder.appendLine("    \"${first.name.lowercase()}\": \"${first.example ?: "???"}\"")
    }
    builder.appendLine("}")
    builder.appendLine("```")

    return builder.toString()
}

fun generateVitepressStuff(outputDir: File, sidebarPath: String = "generated/sidebar.ts") {
    val mdFiles = outputDir.listFiles { file -> file.extension == "md" } ?: return

    val items = mdFiles.sortedBy { it.nameWithoutExtension }.joinToString(",\n") { file ->
        val name = file.nameWithoutExtension
        "      { text: '$name', link: '/generated/$name' }"
    }

    val sidebarContent = """
        |export const sidebar = {
        |    text: 'Conditions',
        |    items: [
        |$items
        |    ]
        |  }
        |]
    """.trimMargin()

    File(sidebarPath).writeText(sidebarContent)
}