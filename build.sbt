import play.Project._

name := """challenge-play-java"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.xerial" % "sqlite-jdbc" % "3.8.10.1",
  "org.json"%"org.json"%"chargebee-1.0",
  "org.json" % "json" % "20151123",
  "com.googlecode.json-simple" % "json-simple" % "1.1",
  "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13",
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.5.0",
  javaCore,
  javaJdbc,
  javaEbean
)

playJavaSettings