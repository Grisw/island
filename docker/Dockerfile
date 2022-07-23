FROM amazoncorretto:11

ARG main_class

ADD . /app

WORKDIR /app

ENTRYPOINT java -cp /app/libs/*: $main_class --spring.config.location=file:/app/conf/,classpath:/ --spring.profiles.active=prd
