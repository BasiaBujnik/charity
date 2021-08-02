docker build -t jmeter .
docker image ls
docker run --rm jmeter

#run container and enter shell
#docker run -it --entrypoint /bin/sh adoptopenjdk/openjdk8:x86_64-alpine-jre8u292-b10
#docker run -it --entrypoint /bin/sh jmete
