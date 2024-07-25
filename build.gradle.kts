// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
}


buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.classpath.hilt.android.gradle.plugin)
        classpath(libs.classpath.datadog)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}