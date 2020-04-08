ThisBuild / scalaVersion := "2.11.12"
ThisBuild / version := "0.1"
ThisBuild / organization := "sn.demo"

val sparkVersion = "2.3.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8")
// scapegoatVersion in ThisBuild := "1.3.8"

lazy val bmdistributionMarketingProject = (project in file("."))
  .settings(
    name := "DemoSparkCICD",
    libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion,
    libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
  )