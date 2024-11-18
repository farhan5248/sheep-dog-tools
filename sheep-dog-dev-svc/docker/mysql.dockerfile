FROM mysql:9.1.0
LABEL "maintainer"=farhan.sheikh.5248@gmail.com
COPY healthcheck.sh /usr/local/bin/
HEALTHCHECK --interval=10s --timeout=5s --retries=3 CMD ["healthcheck.sh"]