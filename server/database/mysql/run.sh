#!/usr/bin/env bash

DATA_DIR=$PWD/data
CONF_DIR=$PWD/conf

mkdir -p $DATA_DIR
mkdir -p $CONF_DIR

docker run \
  -p 13306:3306 \
  -u $UID:$GROUPS \
  -v $DATA_DIR:/var/lib/mysql \
  -v $CONF_DIR:/etc/mysql/conf.d \
  -e MYSQL_ROOT_PASSWORD='9C8D5584-5ABB-465A-876A-8F8E50512882' \
  -e MYSQL_DATABASE='test_db' \
  -e MYSQL_USER='test_user' \
  -e MYSQL_PASSWORD='7C8EA8A2-D430-4821-9E75-D7C413EDF9BA' \
  -e MYSQL_CHARSET="utf8" \
  -d mysql:5.5
