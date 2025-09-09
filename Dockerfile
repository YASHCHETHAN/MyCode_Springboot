FROM openjdk:21
WORKDIR /dockerdir
COPY ./target/Yashchethan.jar  /dockerdir
EXPOSE 10100
CMD ["java","-jar","Yashchethan.jar"]