## A little help to get you started with FoundationDB

A little scaffolding to help you get started with [FoundationDB](http://foundationdb.com/) in Java included is:

* A script to install FoundationDB's [client jars] (http://foundationdb.com/get/) into your pom repo
* A pom.xml with the foundationdb jars listed as dependencies

## To use

1. Sign-up to [get FoundationDB](http://foundationdb.com/get/)
2. [Install FoundationDB](http://foundationdb.com/documentation/beta1/getting-started-linux.html) on your Ubuntu 12.04 machine
3. Install the foundationdb jars in your repository

`./mvn_install_fdbclients.sh fdb-java-0.2.1-2-linux-x64.jar fdb-java-0.2.1-3-javadoc.jar`

4. Optionally bootstrap a Linux project

mvn eclipse

5. Load the eclipse project! You should now be able to play with foundationdb -- start typing com.foundationdb

6. Explore [the javadocs](http://foundationdb.com/documentation/beta1/javadoc/index.html), etc, have fun!
