FROM openjdk:11

EXPOSE 8282
ARG JAR_FILE=target/Demo.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]