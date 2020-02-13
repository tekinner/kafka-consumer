FROM openjdk:8
ADD build/libs/kafka-consumer-0.0.1.ERT.jar kafka-consumer-0.0.1.ERT.jar
ADD src/main/resources/application.yml application.yml
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "kafka-consumer-0.0.1.ERT.jar"]