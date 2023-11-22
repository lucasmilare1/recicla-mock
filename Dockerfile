FROM maven:3.8.5-openjdk-17 as build

RUN mkdir -p /usr/src/app/mock
WORKDIR /usr/src/app/mock
ADD . /usr/src/app/mock
RUN mvn package

FROM eclipse-temurin:17-jdk-ubi9-minimal
WORKDIR /usr/src/app/mock
ADD . /usr/src/app/mock
COPY --from=build /usr/src/app/mock/target/mock.jar /usr/src/app/mock

CMD ["java", "-jar", "mock.jar"]
