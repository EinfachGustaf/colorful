package live.einfachgustaf.colorful.listener

import live.einfachgustaf.colorful.config.ConfigManager.config
import live.einfachgustaf.colorful.miniMessage
import net.axay.kspigot.event.listen
import org.bukkit.event.server.ServerListPingEvent

object MotdListener {

    init {
        listen<ServerListPingEvent> {
            it.motd(miniMessage.deserialize(config.motd))
        }
    }
}