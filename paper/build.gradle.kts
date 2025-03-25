plugins {
    alias(libs.plugins.paperweight)         // Paperweight plugin for Minecraft server development
    alias(libs.plugins.bukkit.factory)      // Bukkit resource factory plugin for generating plugin.yml at build time
    alias(libs.plugins.run.paper)           // The run-task plugin for running a test server and testing the plugin
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle(libs.versions.paper) // Paper development bundle

    // implementation(libs.bstats)
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17) // Use Java 17 toolchain
}

tasks {
    runServer {
        minecraftVersion("1.18.2") // Configure the Minecraft server version.
        downloadPlugins {
            // Download ViaVersion and ViaBackwards plugins.
            modrinth("viaversion", "5.2.2-SNAPSHOT+686")
            modrinth("viabackwards", "5.2.2-SNAPSHOT+391")
        }
    }

//    shadowJar {
//        relocate("org.bstats", "example.plugin.template.libs.bstats")
//    }
}

bukkitPluginYaml {
    name = "MCTemplate"
    main = "example.plugin.template.Template"
    authors.add("Author")
    apiVersion = "1.18"
}
