plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("io.ktor.plugin")
}

group = "com.example"

application {
    mainClass.set("com.example.ApplicationKt")
}

dependencies {
    implementation(project(":shared"))
}