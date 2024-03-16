rootProject.name = "KotlinProject"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":composeApp")
include("common:auth:api")
include("common:auth:presentation")
include("common:auth:data")
include("common:tournaments:api")
include("common:tournaments:presentation")
include("common:tournaments:data")
include("common:games:api")
include("common:games:presentation")
include("common:games:data")
include("common:core")