FROM java:8-jre
MAINTAINER Yu Gan <yg397@cornell.edu>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761