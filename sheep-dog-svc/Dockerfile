FROM eclipse-temurin:21-jdk-alpine
ARG email="farhan.sheikh.5248@gmail.com"
LABEL "maintainer"=$email
RUN mkdir -p /target
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]