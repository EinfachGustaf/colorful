package live.einfachgustaf.colorful.config

import kotlinx.serialization.json.Json
import live.einfachgustaf.colorful.models.Config
import live.einfachgustaf.colorful.models.Tablist
import net.axay.kspigot.config.kSpigotConfig
import java.io.File

object ConfigManager {

    val config by kSpigotConfig<Config>(createFile(File("plugins/colorful/config.json")), stringFormat = Json {
        prettyPrint = true
    }, default = { Config(
        false,
        false,
        "<rainbow>A Minecraft server using</rainbow> <yellow>Colorful</yellow>",
        Tablist(
            "<rainbow>A Minecraft server using</rainbow> <yellow>Colorful</yellow>",
            "<red>:)</red>"
        )
    ) })

    private fun createFile(file: File): File {
        if (!file.parentFile.exists()) file.parentFile.mkdir()
        if (!file.exists()) file.createNewFile()
        return file
    }
}