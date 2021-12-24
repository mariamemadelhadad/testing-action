FROM gcc:latest

# These commands copy your files into the specified directory in the image
# and set that as the working location
COPY . /usr/src/test
WORKDIR /usr/src/test

# This command compiles your app using GCC, adjust for your source code
RUN g++ -o test test.cpp

# This command runs your application, comment out this line to compile only
CMD ["./test"]