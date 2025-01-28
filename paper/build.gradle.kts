plugins {
    alias(libs.plugins.paperweight) // Paperweight plugin for Minecraft server development
    alias(libs.plugins.bukkit.factory) // Bukkit resource factory plugin for generating plugin.yml at build time
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle(libs.versions.paper) // Paper development bundle
}

bukkitPluginYaml {
    name = "MCTemplate"
    main = "example.plugin.template.Template"
    authors.add("Author")
    apiVersion = "1.18.2"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17) // Use Java 17 toolchain
    }
}
