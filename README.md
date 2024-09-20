Gatling plugin for SBT - Scala demo project
===========================================

A simple showcase of an SBT project using the Gatling plugin for SBT. Refer to the plugin documentation
[on the Gatling website](https://docs.gatling.io/reference/integrations/build-tools/sbt-plugin/) for usage.

This project is written in Scala. For other languages, consider using
[our other supported build plugins](https://docs.gatling.io/reference/extensions/).

It includes:

* minimal `build.sbt`, requiring [SBT 1](https://www.scala-sbt.org/download.html)
* latest version of the `io.gatling:gatling-sbt` plugin applied
* sample [Simulation](https://docs.gatling.io/reference/glossary/#simulation) class,
  demonstrating sufficient Gatling functionality
* proper source file layout
  * both the `test` and `it` (integration test) configurations are shown
