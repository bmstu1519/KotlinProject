plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {

}

kotlin {
    sourceSets["main"].kotlin.srcDir("buildSrc/src/main/kotlin")
}