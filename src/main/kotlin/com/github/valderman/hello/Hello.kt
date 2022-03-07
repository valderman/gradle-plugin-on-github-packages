package com.github.valderman.hello

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property

class Hello : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create("hello", HelloExtension::class.java)
        target.task("hello") {
            it.doLast {
                val receiver = extension.receiver.get()
                println("Kära $receiver.\n\n\n\n\nHej.")
            }
        }
    }
}

abstract class HelloExtension {
    abstract val receiver: Property<String>
    
    init {
        receiver.convention("Frodo Bagger")
    }
}
