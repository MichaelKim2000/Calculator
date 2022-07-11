# Dockerfile
FROM adoptopenjdk:11.0.10_9-jre-hotspot
RUN useradd app
USER app
#COPY target/*.jar /Calculator.jar
ADD target/Calculator-1.0.4.jar /Calculator-1.0.4.jar
CMD ["java", "-jar", "/Calculator-1.0.4.jar"]




