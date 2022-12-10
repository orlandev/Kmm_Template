import java.net.URI

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url= URI("https://jitpack.io")}
        jcenter()
    }
}

rootProject.name = "Kmm_Template"
include(":androidApp")
include(":shared")