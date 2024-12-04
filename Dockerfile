FROM ubuntu:18.04

RUN apt-get update && \
    apt-get install -u openjdk-21-jdk -y &&\
    apt-get clean;

WORKDIR /app

COPY build/libs/massive.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]


