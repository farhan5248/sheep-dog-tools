FROM eclipse-temurin:21-jdk-alpine
ARG basedir="mbt"
LABEL "maintainer"=farhan.sheikh.5248@gmail.com
ENV BASEDIR=$basedir
RUN mkdir -p /$basedir
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]