plugins{
      `kotlin-dsl`
}

repositories {
      google()
      mavenCentral()
}

dependencies {
      implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
      implementation("com.android.tools.build:gradle:8.1.3")
}

val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions {
      jvmTarget = "17"
}