package com.github.cts3.plugintest.services

import com.intellij.openapi.project.Project
import com.github.cts3.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
