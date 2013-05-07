## A little help to get you started with FoundationDB

A little scaffolding to help you get started with [FoundationDB](http://foundationdb.com/) in Java if you're anal like me and like to keep everything in your mvn repo.

* A script to install FoundationDB's [client jars] (http://foundationdb.com/get/) into your pom repo
* A pom.xml with the foundationdb jars listed as dependencies
* FoundationDB's hello world code, contained in com.o19s.Example for you to hack on!

## To use

1. Sign-up to [get FoundationDB](http://foundationdb.com/get/) and download the [foundationdb packages and jars](http://community.foundationdb.com/downloads/)
2. [Install FoundationDB](http://foundationdb.com/documentation/beta1/getting-started-linux.html) on your Ubuntu 12.04 machine
3. Install the foundationdb jars in your mvn repository:

`./mvn_install_fdbclients.sh fdb-java-0.2.1-2-linux-x64.jar fdb-java-0.2.1-3-javadoc.jar`

4. Optionally bootstrap a Linux project to import into Eclipse

mvn eclipse

5. Build/Run via Maven

`mvn compile
`mvn exec:java -Dexec.mainClass="com.o19s.Example"

6. Explore [the javadocs](http://foundationdb.com/documentation/beta1/javadoc/index.html), etc, have fun!
