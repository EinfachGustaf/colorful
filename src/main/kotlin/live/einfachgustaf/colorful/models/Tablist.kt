package live.einfachgustaf.colorful.models

import kotlinx.serialization.Serializable

@Serializable
data class Tablist(
    val header: String,
    val footer: String
)
