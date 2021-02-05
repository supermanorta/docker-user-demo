## optimized image re-using layers
#FROM openjdk:11
#
## Create new non root user named 'spring'
#RUN adduser spring
#
## Switch to new user
#USER spring
#
## set working directory
#WORKDIR /home/spring
#
#ARG DEPENDENCY=build/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","com.tefnick.userservice.UserServiceApplication"]

# non optimized image using a fat jar
FROM openjdk:11

RUN adduser demo
USER demo

# set working directory
WORKDIR /home/demo

COPY build/libs/*.jar app.jar
RUN chmod 777 /home/demo
ENTRYPOINT ["java","-jar","app.jar"]
