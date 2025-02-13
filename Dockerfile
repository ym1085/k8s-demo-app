FROM openjdk:17

LABEL authors="youngmin1085@gmail.com"

WORKDIR /apps/

COPY build/libs/*.jar k8s-demo-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "k8s-demo-app.jar"]
