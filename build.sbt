name := "scala-feature-tour"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0", // async http library
  "org.slf4j" % "slf4j-nop" % "1.6.4" // used by dispatch
)
