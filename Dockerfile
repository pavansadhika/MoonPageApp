#FROM tomcat:8.0-alpine
FROM tomcat:8.0.20-jre8
LABEL maintainer="pavan@knowingaboutyourchild.com"
COPY ./target/*.war /usr/local/tomcat/webapps/
EXPOSE 8080
#CMD ["catalina.sh", "run"]
