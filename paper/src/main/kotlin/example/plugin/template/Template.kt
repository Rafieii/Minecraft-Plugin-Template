package example.plugin.template

import org.bukkit.plugin.java.JavaPlugin

class Template: JavaPlugin() {
    
    companion object {
        private lateinit var instance: Template
//        private lateinit var metrics: Metrics

        fun getInst(): Template {
            return instance
        }
    }

    // Called when the plugin is enabled (initialize resources, register events/commands).
    override fun onEnable() {
        instance = this

//        metrics = Metrics(getInst(), /* bStats ID Here */)
    }

    // Called when the plugin is disabled (cleanup resources, save data).
    override fun onDisable() {
//        metrics.shutdown()
    }
}