FROM amazoncorretto:11

ARG main_class

ENV MAIN_CLASS=$main_class

ADD . /app

WORKDIR /app

ENTRYPOINT java -cp /app/libs/*: $MAIN_CLASS --spring.config.location=file:/app/conf/,classpath:/ --spring.profiles.active=prd
