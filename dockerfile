FROM tomcat:8.0.20-jre8
COPY /var/jenkins_home/workspace/Mypipeline/webapp/target/webapp.war   /usr/local/tomcat/webapps/
