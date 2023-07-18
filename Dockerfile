FROM openjdk:17
VOLUME /tmp
ADD ./target/springboot-ms-usuarios-0.0.1-SNAPSHOT.jar springboot-ms-usuarios.jar
ENTRYPOINT ["java", "-jar", "/springboot-ms-usuarios.jar"]