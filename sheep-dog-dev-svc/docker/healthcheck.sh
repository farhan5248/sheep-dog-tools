#!/bin/bash
echo "select 'farhan';" | mysql -u root -pmbt-pass

if [ $? -eq 1 ]; then
  exit 1
fi

cnt=$(echo "select user from mysql.user where user = 'mbt';" | mysql -u root -pmbt-pass | wc -l)

if [ $cnt -eq 0 ]; then
# TODO move this all to a single sql script
  echo "create user 'mbt'@'%' identified by 'mbt';" | mysql -u root -pmbt-pass
  echo "create database mbt;" | mysql -u root -pmbt-pass
  echo "GRANT ALL PRIVILEGES ON mbt.* TO 'mbt';" | mysql -u root -pmbt-pass
fi

exit 0