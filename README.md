Gatling's SBT plugin demo
=========================

A simple project showing how to configure and use Gatling's SBT plugin to run Gatling simulations. 

Get the project
---------------

```bash
git clone https://github.com/gatling/gatling-sbt-plugin-demo.git
```

Start SBT
---------

```bash
$ cd gatling-sbt-plugin-demo
$ sbt
```

Compile the simulations
-----------------------

```bash
> compile
```

Run all simulations
-------------------

```bash
> test
```

Run a single simulation
-----------------------

```bash
> testOnly computerdatabase.BasicSimulation
```

Open the last report
--------------------

```bash
> lastReport
```
