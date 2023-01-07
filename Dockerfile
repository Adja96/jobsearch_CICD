FROM openjdk:1.8
EXPOSE 8080
ADD target/admin-app.jar admin-app.jar
ENTRYPOINT ["java", "-jar", "/admin-app.jar"]