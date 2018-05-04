- 需要下载服务端
https://www.consul.io/downloads.html

1.windows 放入 system32中

2.cmd 中运行
``
consul agent -dev
``

3.运行application，访问 http://localhost:8083/get_service_name