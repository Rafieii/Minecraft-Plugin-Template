plugins {
    alias(libs.plugins.paperweight) // Paperweight plugin for Minecraft server development
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle(libs.versions.paper) // Paper development bundle for 1.18.2
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17) // Use Java 17 toolchain
    }
}
