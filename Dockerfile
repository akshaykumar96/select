FROM openjdk:8-jre-alpine
COPY ./target/SelectService-0.0.1-SNAPSHOT.jar /usr/src/selectservice/
WORKDIR /usr/src/selectservice
EXPOSE 9007
CMD ["java", "-jar", "SelectService-0.0.1-SNAPSHOT.jar"]