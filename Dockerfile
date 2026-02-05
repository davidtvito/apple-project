FROM eclipse-temurin:11-jre
COPY target/apple-project*.jar /usr/src/apple-project.jar
COPY src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/apple-project.jar", "--spring.config.location=file:/opt/conf/application.properties"]