FROM mysql:9.1.0
LABEL "maintainer"=farhan.sheikh.5248@gmail.com

# Add these environment variables
ENV MYSQL_ROOT_HOST=%
ENV MYSQL_ROOT_PASSWORD=root

COPY bootstrap.sh /docker-entrypoint-initdb.d