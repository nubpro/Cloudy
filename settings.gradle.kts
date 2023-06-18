@file:Suppress("UnstableApiUsage")

include(":benchmark")


pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven(url = "https://plugins.gradle.org/m2/")
    maven(url = "https://jitpack.io")
  }
}
dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
    maven(url = "https://plugins.gradle.org/m2/")
    maven(url = "https://jitpack.io")
  }
}

rootProject.name = "CloudyDemo"
include(":app")
include(":cloudy")
