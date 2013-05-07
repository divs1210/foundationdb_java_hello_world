## A little help to get you started with FoundationDB

This project is some scaffolding to help you get started with [FoundationDB](http://foundationdb.com/) in Java, including:

* A script to install FoundationDB's [client jars] (http://foundationdb.com/get/) into your pom repo
* A pom.xml with the FoundationDB jars listed as dependencies
* A maven project to hack on FoundationDB ideas, equiped with a "Hello World" in com.o19s.Example

## To use

1. Sign-up to [get FoundationDB](http://foundationdb.com/get/) and download the [FoundationDB server and java client jars](http://community.foundationdb.com/downloads/)
2. [Install/Launch FoundationDB](http://foundationdb.com/documentation/beta1/getting-started-linux.html) on your Ubuntu 12.04 machine.
3. Install the FoundationDB client jars in your mvn repository:

    ./mvn_install_fdbclients.sh fdb-java-0.2.1-2-linux-x64.jar fdb-java-0.2.1-3-javadoc.jar`

4. Optionally bootstrap a Linux project to import into Eclipse

    mvn eclipse

5. Build/Run via Maven

    mvn compile
    mvn exec:java -Dexec.mainClass="com.o19s.Example"

6. Explore [the javadocs](http://foundationdb.com/documentation/beta1/javadoc/index.html), etc, have fun!
