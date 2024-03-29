plugins {
    kotlin("jvm") version "1.9.21"
    id("io.papermc.paperweight.userdev") version "1.5.11"
    id("xyz.jpenilla.run-paper") version "2.0.1"
    kotlin("plugin.serialization") version "1.9.22"
}

group = "live.einfachgustaf"
version = "1.1"

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
    implementation("net.axay:kspigot:1.20.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}

kotlin {
    jvmToolchain(17)
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}