FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/sccPracticalExercise.jar app.jar
CMD ["java", "-jar", "app.jar"]
