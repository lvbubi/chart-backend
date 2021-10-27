FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY './build/libs/chart-backend-0.0.1-SNAPSHOT-plain.jar' app.jar
ENTRYPOINT ["java","-jar","/app.jar"]