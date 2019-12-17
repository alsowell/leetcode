#!/usr/bin/env bash
#开始生成补丁
if [ "${UPLOAD_ADMOB}" = true ]
then
    printf "开始判断本地python 依赖"
    python ${JENKINS_HOME}/python/get-pip.py
    printf "pip 安装完毕"
    pip install oss2
    printf "oss2 安装完毕"
    echo
fi