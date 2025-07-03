plugins {
    kotlin("jvm") version "2.1.0"
}

group = "me.loaforc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(23)
}