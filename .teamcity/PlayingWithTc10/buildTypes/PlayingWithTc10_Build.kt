package PlayingWithTc10.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object PlayingWithTc10_Build : BuildType({
    uuid = "c2386573-5878-4074-887f-c7d5fbe20788"
    extId = "PlayingWithTc10_Build"
    name = "Build"

    vcs {
        root(PlayingWithTc10.vcsRoots.PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster)

    }

    steps {
        script {
            name = "We run!"
            scriptContent = """echo "all good""""
        }
    }

    triggers {
        vcs {
        }
    }
})
