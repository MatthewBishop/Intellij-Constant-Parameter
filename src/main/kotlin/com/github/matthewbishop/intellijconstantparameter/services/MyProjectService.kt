package com.github.matthewbishop.intellijconstantparameter.services

import com.intellij.openapi.project.Project
import com.github.matthewbishop.intellijconstantparameter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
