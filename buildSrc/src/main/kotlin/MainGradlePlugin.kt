import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author：HGM
 * @created：2024/1/17 0017
 * @description：
 **/
class MainGradlePlugin : Plugin<Project> {

      override fun apply(project: Project) {
            applyPlugins(project)
            setProjectConfig(project)
      }

      // 应用其他插件以便使用
      private fun applyPlugins(project: Project) {
            project.apply {
                  plugin("android-library")
                  plugin("kotlin-android")
                  plugin("kotlin-kapt")
                  plugin("dagger.hilt.android.plugin")
            }
      }

      // 项目配置
      private fun setProjectConfig(project: Project) {
            project.android().apply {
                  compileSdk = ProjectConfig.compileSdk

                  defaultConfig {
                        minSdk = ProjectConfig.minSdk

                        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                  }

                  compileOptions {
                        sourceCompatibility = JavaVersion.VERSION_17
                        targetCompatibility = JavaVersion.VERSION_17
                  }
            }
      }


      private fun Project.android(): LibraryExtension {
            return extensions.getByType(LibraryExtension::class.java)
      }

}