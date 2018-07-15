FROM java:8-jre
MAINTAINER Yu Gan <yg397@cornell.edu>

ADD ./target/notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notification-service.jar"]

EXPOSE 8000