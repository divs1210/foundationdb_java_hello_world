#!/usr/bin/env bash

FDB_CLIENT_JAR=fdb-java-0.2.1-2-linux-x64.jar
FDB_JAVADOC_JAR=fdb-java-0.2.1-3-javadoc.jar

mvn install:install-file -Dfile=$FDB_CLIENT_JAR -DgroupId=com.foundationdb \
        -DartifactId=fdbclient -Djavadoc=$FDB_JAVADOC_JAR \
        -Dversion=0.2.1 -Dpackaging=jar
