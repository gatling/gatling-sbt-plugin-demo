val gatlingVersion = "3.15.0"

lazy val gatlingSbtPluginDemo = rootProject
  .enablePlugins(GatlingPlugin)
  .settings(
    scalaVersion := "2.13.18",

    scalacOptions := Seq(
      "-encoding", "UTF-8", "-release:8", "-deprecation",
      "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps"),

    libraryDependencies ++= Seq(
      "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test",
      "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test")
  )

// Enterprise Cloud (https://cloud.gatling.io/) configuration reference: https://docs.gatling.io/reference/integrations/build-tools/sbt-plugin/#running-your-simulations-on-gatling-enterprise-cloud
