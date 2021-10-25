import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("kapt") version "1.5.31"
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.mkarwowski"
version = "1.0-SNAPSHOT"

kapt {
    generateStubs = true
    keepJavacAnnotationProcessors = true
}

repositories {
    mavenCentral()
}

dependencies {
    implementation( "com.google.dagger:dagger:2.39.1")
    annotationProcessor( "com.google.dagger:dagger-compiler:2.39.1")
    kapt( "com.google.dagger:dagger-compiler:2.39.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}