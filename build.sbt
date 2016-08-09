name := "SimpleBrowser"

version := "1.0"

scalaVersion := "2.11.8"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))

libraryDependencies ++= List(
    "org.scalafx" %% "scalafx" % "8.0.92-R10",
    "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2",
    "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0",
    "org.scala-lang.modules" %% "scala-xml" % "1.0.4",
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

fork := true
