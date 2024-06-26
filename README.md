# Spring request tracing demo

A simple demo to demonstrate request tracing using micrometer and zipkin.

## To run Zipkin locally

reference: https://zipkin.io/pages/quickstart

```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

open browser at http://localhost:9411/

### Other useful zipkin api urls:
- http://localhost:9411/zipkin/api/v2/traces
- http://localhost:9411/zipkin/api/v2/services
- http://localhost:9411/zipkin/api/v2/spans?serviceName=demo

reference: https://github.com/openzipkin/zipkin-api/blob/master/zipkin2-api.yaml

## Run both webservers

```
cd ./webserver1 && mvn clean spring-boot:run
cd ./webserver2 && mvn clean spring-boot:run
```

webserver1 is running at localhost:8080/
webserver2 is running at localhost:8081/

## Test it out

hit localhost:8080/

open zipkin at localhost:9411

you should see: one trace id with three span ids
