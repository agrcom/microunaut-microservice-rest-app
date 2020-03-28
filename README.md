# microunaut-microservice-rest-app

Project based on articles:

https://codelabs.developers.google.com/codelabs/cloud-micronaut-kubernetes/#3
https://piotrminkowski.com/2019/01/25/quick-guide-to-microservices-with-micronaut-framework/

## Build Docker daemon
``` mvn compile com.google.cloud.tools:jib-maven-plugin:2.1.0:dockerBuild ```

## Build your container image with:
``` mvn compile jib:build ```