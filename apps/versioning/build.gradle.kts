plugins {
    application
    id("org.mrmat.plugins.version")
    id("mrmat.kotlin-conventions")
}

group = "org.mrmat.hello.kotlin.app.versioning"

application {
    mainClass.set("org.mrmat.hello.kotlin.app.versioning.MainKt")
}
