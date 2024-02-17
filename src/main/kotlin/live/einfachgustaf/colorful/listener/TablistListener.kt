package live.einfachgustaf.colorful.listener

import live.einfachgustaf.colorful.config.ConfigManager.config
import live.einfachgustaf.colorful.miniMessage
import net.axay.kspigot.event.listen
import org.bukkit.event.player.PlayerJoinEvent

object TablistListener {

    init {
        listen<PlayerJoinEvent> {
            with(it.player) {
                sendPlayerListHeader(miniMessage.deserialize(config.tablist.header))
                sendPlayerListFooter(miniMessage.deserialize(config.tablist.footer))
            }
        }
    }
}