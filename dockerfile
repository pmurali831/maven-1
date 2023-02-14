FROM tomcat:8.0.20-jre8
COPY webapp/target/webapp.war   /usr/local/tomcat/webapps/
