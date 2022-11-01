# Use Java 11
FROM openjdk:11-jdk

#COPY JAR FILE
COPY chamarDeSeu.jar chamarDeSeu.jar

ENTRYPOINT ["java","-jar","chamarDeSeu.jar"]