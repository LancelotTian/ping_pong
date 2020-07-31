FROM docker.io/centos:7.3.1611
MAINTAINER leon <bjsmith@sina.com>
ADD target/ping_pong-*.jar /opt/ping_pong.jar

ENTRYPOINT ["java", "-jar", "/opt/ping_pong.jar", "-Xms512m", "-Xmx512m"]