ARG ENV

FROM maven:3.8.5-openjdk-17 as build
COPY . usr/src/app
COPY logback-spring.xml /usr/src/app/src/app
RUN mvn -f /usr/src/app/pom.xml -Dskiptest clean package -T 4 -s /usr/src/app/settings.xml


RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn package

FROM eclipse-temurin:17-jdk-ubi9-minimal
ARG ENV
ENV PROFILE=$ENV

COPY --from=build /usr/src/app/target/mock.jar usr/app/mock.jar

CMD ["java", "-jar", "mock.jar"]
