FROM mysql:9.1.0
LABEL "maintainer"=farhan.sheikh.5248@gmail.com
ENV MYSQL_ROOT_HOST=%
COPY my.cnf /etc/mysql/conf.d/my.cnf
COPY bootstrap.sh /docker-entrypoint-initdb.d