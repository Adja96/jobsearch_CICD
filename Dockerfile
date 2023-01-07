FROM openjdk:1.8
EXPOSE 8080
ADD target/devops-webservice1.jar devops-webservice1.jar
ENTRYPOINT ["java", "-jar", "/devops-webservice1.jar"]