package PlayingWithTc10

import PlayingWithTc10.buildTypes.*
import PlayingWithTc10.vcsRoots.*
import PlayingWithTc10.vcsRoots.PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a451b6c3-a4ae-488e-833c-8892af93aeb1"
    extId = "PlayingWithTc10"
    parentId = "_Root"
    name = "Playing With Tc10"

    vcsRoot(PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster)

    buildType(PlayingWithTc10_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
