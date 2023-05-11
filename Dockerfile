
FROM amazoncorretto:20-alpine-jdk
COPY target/cmansilla-0.0.1-SNAPSHOT.jar cmansilla-app.jar
ENTRYPOINT ["java","-jar","cmansilla-app.jar"]
EXPOSE 8080
