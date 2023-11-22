FROM maven:3.8.5-openjdk-17 as build

RUN mkdir -p /Users/src/app/mock
WORKDIR /Users/src/app/mock
ADD . /Users/src/app/mock
RUN mvn package

FROM eclipse-temurin:17-jdk-ubi9-minimal
WORKDIR /Users/src/app/mock
ADD . /Users/src/app/mock
COPY --from=build /Users/src/app/mock/target/mock.jar /Users/src/app/mock.jar

CMD ["java", "-jar", "mock.jar"]
