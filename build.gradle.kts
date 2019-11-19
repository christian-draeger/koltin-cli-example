import org.gradle.api.JavaVersion.*

plugins {
    kotlin("jvm") version "1.3.50"
    application
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    jcenter()
    mavenCentral()
}

java {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
}

application {
    mainClassName = "cli.Main"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
