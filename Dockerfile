FROM maven:3.8.5-openjdk-17 as build

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn package

FROM eclipse-temurin:17-jdk-ubi9-minimal
WORKDIR /usr/src/app
ADD . /usr/src/app
COPY --from=build /usr/src/app/target/mock-recicla.jar mock-recicla.jar

CMD ["java", "-jar", "mock.jar"]
