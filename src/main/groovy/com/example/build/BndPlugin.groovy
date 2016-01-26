package com.example.build

import org.gradle.api.Project
import org.gradle.api.Plugin

import com.bmuschko.gradle.docker.tasks.image.DockerBuildImage

class BndPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        task buildDockerImage(type: DockerBuildImage) {
            println file("${projectDir}/docker/")
        }
    }
}