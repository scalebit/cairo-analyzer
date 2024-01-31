plugins {
    kotlin("jvm") version "1.9.20"
    id("org.jetbrains.intellij") version "1.16.1"
}
sourceSets["main"].java.srcDirs("src/main/gen")
intellij {
    version = "2023.3.2"
    type = "IU"
}

group = "BitsLab.ScaleBit"

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
//    implementation("com.intellij:openapi:1.16.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

