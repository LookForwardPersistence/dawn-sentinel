# dawn-sentinel

### 接入Sentinel控制台
接入 Dashboard 的步骤（缺一不可）：

- 按照 Sentinel 控制台文档 启动控制台
- 应用引入 sentinel-transport-simple-http 依赖，以便控制台可以拉取对应应用的相关信息
给应用添加相关的启动参数，启动应用。需要配置的参数有：
- -Dcsp.sentinel.api.port：客户端的 port，用于上报相关信息
- -Dcsp.sentinel.dashboard.server：控制台的地址
- -Dproject.name：应用名称，会在控制台中显示
~~~
注意某些环境下本地运行 Dubbo 服务还需要加上 -Djava.net.preferIPv4Stack=true 参数
java -Dproject.name=dawn-sentinel -Dcsp.sentinel.api.port=8082 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dserver.port=8082 -jar dawn.sentinel-1.0-SNAPSHOT.jar
~~~
