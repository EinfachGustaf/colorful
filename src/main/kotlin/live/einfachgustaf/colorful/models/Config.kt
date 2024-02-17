package live.einfachgustaf.colorful.models

import kotlinx.serialization.Serializable

@Serializable
data class Config(
    val motdEnabled: Boolean,
    val tablistEnabled: Boolean,
    val motd: String,
    val tablist: Tablist
)