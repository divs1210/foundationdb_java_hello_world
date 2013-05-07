## A little help to get you started with FoundationDB

A little scaffolding to help you get started with [FoundationDB](http://foundationdb.com/) in Java included is:

* The Linux jars (other Jars can also [be downloaded](http://foundationdb.com/get/))
* A script to install them into your pom repo
* A pom.xml with the foundationdb jars listed as dependencies

## To use

1. Sign-up to [get FoundationDB](http://foundationdb.com/get/)
2. [Install FoundationDB](http://foundationdb.com/documentation/beta1/getting-started-linux.html) on your Ubuntu 12.04 machine
3. Install the foundationdb jars in your repository

`./mvn_install_fdbclients.sh fdb-java-0.2.1-2-linux-x64.jar fdb-java-0.2.1-3-javadoc.jar`

4. Optionally bootstrap a Linux project

mvn eclipse

5. Load the eclipse project! You should now be able to play with foundationdb
