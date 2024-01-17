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
      namespace = "com.hgm.module_a"
}

dependencies {
      hilt()
      room()
      retrofit()
}