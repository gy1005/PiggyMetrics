FROM java:8-jre
MAINTAINER Yu Gan <yg397@cornell.edu>

ADD ./target/statistics-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/statistics-service.jar"]

EXPOSE 7000