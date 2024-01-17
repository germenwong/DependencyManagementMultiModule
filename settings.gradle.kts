pluginManagement {
      repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
      }
}
dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
            google()
            mavenCentral()
      }
}

rootProject.name = "DependencyManagement"
include(":app")
include(":module-a")
include(":module-b")
