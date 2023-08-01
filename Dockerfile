FROM docker.io/openjdk:8-alpine
MAINTAINER leon <leon@example.com>
ADD target/ping_pong-*.jar /opt/ping_pong.jar

ENTRYPOINT ["java", "-jar", "/opt/ping_pong.jar", "-Xms512m", "-Xmx512m"]
