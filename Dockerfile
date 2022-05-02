# Dockerfile
FROM adoptopenjdk:11.0.10_9-jre-hotspot
RUN useradd app
USER app
#COPY target/*.jar /Calculator.jar
ADD target/*.jar /Calculator.jar
CMD ["java", "-jar", "/Calculator.jar"]




