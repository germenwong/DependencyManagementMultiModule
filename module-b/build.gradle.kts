plugins {
      // 这里为什么还需要这两个插件呢？
      // 因为涉及到gradle的构建顺序问题，
      // 所以先添加此插件才能识别 android 块
      id("com.android.library")
      id("org.jetbrains.kotlin.android")
}

// 使用自定义插件
apply<MainGradlePlugin>()

android {
      namespace = "com.hgm.module_b"
}

dependencies {
      implementation("androidx.core:core-ktx:1.9.0")
      implementation("androidx.appcompat:appcompat:1.6.1")
      implementation("com.google.android.material:material:1.11.0")
      testImplementation("junit:junit:4.13.2")
      androidTestImplementation("androidx.test.ext:junit:1.1.5")
      androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

      compose()
      hilt()
}