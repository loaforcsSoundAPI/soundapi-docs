package me.loaforc.docgen

data class ConditionType(
    val name: String,
    val summary: String,
    val soundApiId: String?,
    val properties: MutableList<ConditionProperty> = mutableListOf(),
    val enums: MutableMap<String, EnumType> = mutableMapOf()
)