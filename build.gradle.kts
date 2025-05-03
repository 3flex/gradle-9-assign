plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

dokka {
    dokkaSourceSets.configureEach {
        apiVersion = "1.4"
    }
}
