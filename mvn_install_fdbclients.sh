#!/usr/bin/env bash

# FDB_JAVADOC_JAR=fdb-java-0.2.1-3-javadoc.jar

mvn install:install-file -Dfile=$1 -DgroupId=com.foundationdb \
        -DartifactId=fdbclient -Djavadoc=$2 \
        -Dversion=0.2.1 -Dpackaging=jar
