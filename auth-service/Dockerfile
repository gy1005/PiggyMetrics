FROM java:8-jre
MAINTAINER Yu Gan <yg397@cornell.edu>

ADD ./target/auth-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/auth-service.jar"]

EXPOSE 5000