FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/Obsidian-1.0.1.jar app.jar
EXPOSE 8888
CMD ["java", "-jar", "app.jar"]