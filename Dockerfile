FROM maven:latest
ENV APP_HOME=/app/
COPY /pom.xml $APP_HOME
COPY /src $APP_HOME/src/
WORKDIR $APP_HOME
RUN mvn package -DskipTests
ENV JAR_FILE=target/lab1-clean-testable-code-1.0-SNAPSHOT.jar
RUN mv ${JAR_FILE} /lab1-clean-testable-code-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/lab1-clean-testable-code-1.0-SNAPSHOT.jar"]