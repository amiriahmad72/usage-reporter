package com.github.amiriahmad72.usagereporter.services

import com.github.amiriahmad72.usagereporter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
