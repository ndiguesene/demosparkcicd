ThisBuild / scalaVersion := "2.11.12"
ThisBuild / version := "0.1"
ThisBuild / organization := "sn.demo"

val sparkVersion = "2.3.2"

lazy val DemoSparkCICDProject = (project in file("."))
  .settings(
    name := "DemoSparkCICD",
    libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion,
    libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
  )