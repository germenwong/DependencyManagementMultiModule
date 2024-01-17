plugins {
      id("com.android.application")
      id("org.jetbrains.kotlin.android")
}

// MainGradlePlugin 插件不能应用到应用程序级别模块
// 因为该插件并不是一个库，但是我们可以替换参数

android {
      namespace = "com.hgm.dependencymanagement"
      compileSdk = ProjectConfig.compileSdk

      defaultConfig {
            applicationId = ProjectConfig.appId
            minSdk = ProjectConfig.minSdk
            targetSdk = ProjectConfig.targetSdk
            versionCode = ProjectConfig.versionCode
            versionName = ProjectConfig.versionName

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            vectorDrawables {
                  useSupportLibrary = true
            }
      }

      buildTypes {
            release {
                  isMinifyEnabled = false
                  proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                  )
            }
      }
      compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
      }
      kotlinOptions {
            jvmTarget = "17"
      }
      buildFeatures {
            compose = true
      }
      composeOptions {
            kotlinCompilerExtensionVersion = Versions.composeCompiler
      }
      packaging {
            resources {
                  excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
      }
}

dependencies {

      implementation("androidx.core:core-ktx:1.9.0")
      implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
      implementation("androidx.activity:activity-compose:1.8.2")
      testImplementation("junit:junit:4.13.2")
      androidTestImplementation("androidx.test.ext:junit:1.1.5")
      androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
      androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
      androidTestImplementation("androidx.compose.ui:ui-test-junit4")
      debugImplementation("androidx.compose.ui:ui-tooling")
      debugImplementation("androidx.compose.ui:ui-test-manifest")
      compose()

      // 引入模块A、B
      implementation(project(":module-a"))
      implementation(project(":module-b"))

}