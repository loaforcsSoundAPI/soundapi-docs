package me.loaforc.docgen
data class EnumType(
    val name: String,
    val values: List<EnumValue> = listOf()
)

