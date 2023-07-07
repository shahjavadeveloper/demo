FROM openjdk:11

EXPOSE 8282

ADD target/docker-Demo.jar docker-Demo.jar

ENTRYPOINT ["java","-jar","/docker-Demo.jar" ]