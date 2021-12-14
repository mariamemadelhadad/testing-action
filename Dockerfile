FROM openjdk
WORKDIR /test
COPY . /test
RUN javac hello.java
CMD java hello