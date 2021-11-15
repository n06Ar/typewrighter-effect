package com.github.n06ar.typewrightereffect.services

import com.intellij.openapi.project.Project
import com.github.n06ar.typewrightereffect.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
