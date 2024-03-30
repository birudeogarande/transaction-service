FROM openjdk:21

WORKDIR /myApp

COPY ./target/trasaction-service.jar /myApp/

CMD [ "java", "-jar", "trasaction-service.jar" ]