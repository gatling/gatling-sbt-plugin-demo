enablePlugins(GatlingPlugin)

scalaVersion := "2.10.4"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val bundleArtifact = Artifact("gatling-bundle", "zip", "zip", "bundle")

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.3" % "test,it"
libraryDependencies += "io.gatling"            % "test-framework"            % "1.0"   % "test,it"
libraryDependencies += "io.gatling"            % "gatling-bundle"            % "2.0.3" % "test,it" artifacts bundleArtifact