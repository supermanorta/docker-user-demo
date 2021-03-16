### optimized image re-using layers
#FROM openjdk:11
#
## Create new non root user named 'spring'
#RUN adduser spring
#
## Switch to new user
#USER spring
#
##  # Switch to user that matches the Spring Profiles
##  USER spring
#
## set working directory
#WORKDIR /home/spring
#
## set permissions on dir
#RUN chmod 777 /home/spring
#
#ARG DEPENDENCY=build/dependency
#
## dependency libs
#COPY ${DEPENDENCY}/BOOT-INF/lib app/lib
#
## app manifext
#COPY ${DEPENDENCY}/META-INF app/META-INF
#
## java classes
#COPY ${DEPENDENCY}/BOOT-INF/classes app

#ENTRYPOINT ["java","-cp","app:app/lib/*","com.tefnick.userservice.UserServiceApplication"]
#ENTRYPOINT ["java","--class-path","app:app/lib/*","-Dspring.profiles.active=local","com.tefnick.userservice.UserServiceApplication"]
# non optimized image using a fat jar
FROM openjdk:11

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
#
## set working directory
WORKDIR /home/spring
RUN chmod 777 /home/spring
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=local","-jar","app.jar"]
