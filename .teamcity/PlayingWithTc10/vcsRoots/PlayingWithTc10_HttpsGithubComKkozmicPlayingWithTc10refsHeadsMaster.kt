package PlayingWithTc10.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster : GitVcsRoot({
    uuid = "487e9d45-e92c-402d-80fa-0f0f8d17d2ad"
    extId = "PlayingWithTc10_HttpsGithubComKkozmicPlayingWithTc10refsHeadsMaster"
    name = "https://github.com/kkozmic/playing-with-tc10#refs/heads/master"
    url = "https://github.com/kkozmic/playing-with-tc10"
    authMethod = password {
        userName = "kkozmic"
        password = "zxxe9915e6a92b5589a08099fa59fb2012732185a356bd89137521f01000c5fdaeee75526dbdcbe90038c18529ecdbbe51180b64bd3504c86eb"
    }
})
