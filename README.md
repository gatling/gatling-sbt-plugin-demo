Gatling's SBT plugin demo
=========================

Installation
------------

```
$ sudo wget https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt -P /usr/local/bin && sudo chmod 755 /usr/local/bin/sbt
$ git clone https://github.com/gatling/gatling-sbt-plugin-demo.git && cd gatling-sbt-plugin-demo
```

Run a simulation
----------------
```
$ sbt
> gatling:testOnly *ComputerWorld
```
