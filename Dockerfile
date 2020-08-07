FROM docker.io/openjdk:8-alpine
MAINTAINER leon <bjsmith@sina.com>
ADD target/ping_pong-*.jar /opt/ping_pong.jar

ENTRYPOINT ["java", "-jar", "/opt/ping_pong.jar", "-Xms512m", "-Xmx512m"]