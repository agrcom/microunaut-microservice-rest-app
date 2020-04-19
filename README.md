# microunaut-microservice-rest-app

Project based on articles:

https://codelabs.developers.google.com/codelabs/cloud-micronaut-kubernetes/#3
https://piotrminkowski.com/2019/01/25/quick-guide-to-microservices-with-micronaut-framework/
https://github.com/piomin/sample-micronaut-microservices

## Build Docker daemon
``` mvn compile com.google.cloud.tools:jib-maven-plugin:2.1.0:dockerBuild ```

## Build your container image with:
``` mvn compile jib:build ```

## Versioning

https://www.mojohaus.org/versions-maven-plugin/

### set new version
    mvn versions:set -DnewVersion=1.0.1-SNAPSHOT

### set new versions for child modules
    mvn versions:set versions:update-child-modules -DnewVersion=1.0.1-SNAPSHOT

### auto update version
    mvn release:update-versions

#### as above + no prompt question
    mvn release:update-versions -DautoVersionSubmodules=true

####  Create next snapshot
    versions:use-next-snapshots




