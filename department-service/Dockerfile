FROM openjdk:8
ADD target/docker-department-image.jar docker-department-image.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","docker-department-image.jar"]