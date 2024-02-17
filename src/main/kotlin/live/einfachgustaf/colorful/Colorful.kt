package live.einfachgustaf.colorful

import live.einfachgustaf.colorful.config.ConfigManager
import live.einfachgustaf.colorful.listener.MotdListener
import live.einfachgustaf.colorful.listener.TablistListener
import net.axay.kspigot.main.KSpigot

class Colorful: KSpigot() {

    companion object {
        lateinit var INSTANCE: Colorful; private set
    }

    override fun load() {
        // the 'onLoad' function

        INSTANCE = this
    }

    override fun startup() {
        // the 'onEnable' function

        if (ConfigManager.config.motdEnabled) MotdListener
        if (ConfigManager.config.tablistEnabled) TablistListener
    }

    override fun shutdown() {
        // the 'onDisable' function
    }
}