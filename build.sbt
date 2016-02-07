//
// Settings
//
name := "greet"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.3.0"
)

resolvers += Resolver.sonatypeRepo("public")

//
// Tasks
//
assemblyOutputPath in assembly := target.value / s"${artifact.value.name}.jar"

