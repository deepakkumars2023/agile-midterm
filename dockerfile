FROM openjdk:11
COPY target/evenodd-1.0-SNAPSHOT.jar evenodd.jar
ENTRYPOINT ["java", "-jar", "evenodd.jar"]
