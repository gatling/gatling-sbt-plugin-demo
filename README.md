Gatling's SBT plugin demo
=========================

A simple project showing how to configure and use Gatling's SBT plugin to run Gatling simulations. 

This project uses SBT 1, which is available [here](https://www.scala-sbt.org/download.html).

Get the project
---------------

```bash
git clone https://github.com/gatling/gatling-sbt-plugin-demo.git && cd gatling-sbt-plugin-demo
```

Start SBT
---------
```bash
$ sbt
```

Run all simulations
-------------------

```bash
> gatling:test
```

Run a single simulation
-----------------------

```bash
> gatling:testOnly computerdatabase.BasicSimulation
```

List all tasks
--------------------

```bash
> tasks gatling -v
```
