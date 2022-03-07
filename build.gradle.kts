import java.net.URI

plugins {
    kotlin("jvm") version "1.6.10"
    id("java-gradle-plugin")
    `maven-publish`
}

group = "com.github.valderman"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

gradlePlugin {
    val hello by plugins.creating {
        id = "com.github.valderman.hello"
        implementationClass = "com.github.valderman.hello.Hello"
    }
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = URI.create("https://maven.pkg.github.com/valderman/gradle-plugin-on-github-packages-maven-repo")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
