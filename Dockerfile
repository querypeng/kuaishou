# Build with: 
FROM registry.i-fun.club/java-oracle:jdk_8_UTF8
ADD KUAISHOU.jar /usr/src/KUAISHOU.jar
WORKDIR /usr/src 
CMD ["java", "-Duser.timezone=Asia/Shanghai", "-Djava.security.egd=file:/dev/./urandom", "-jar", "KUAISHOU.jar"]
