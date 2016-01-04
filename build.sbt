import play.Project._

name := """challenge-play-java"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.xerial" % "sqlite-jdbc" % "3.8.10.1",
  javaCore,
  javaJdbc,
  javaEbean
)

playJavaSettings