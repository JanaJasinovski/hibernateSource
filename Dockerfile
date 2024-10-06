FROM openjdk:21
ADD /build/libs/hibernateSource-1.0-SNAPSHOT.jar hibernateSource.jar
ARG PORT
EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "hibernateSource.jar"]