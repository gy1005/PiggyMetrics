FROM java:8-jre
MAINTAINER Yu Gan <yg397@cornell.edu>

ADD ./target/monitoring.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring.jar"]

EXPOSE 8989 8080