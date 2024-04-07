FROM openjdk:17
EXPOSE 8081
ADD target/docker-demo-0.0.2-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java", "-jar", "/my-app.jar"]