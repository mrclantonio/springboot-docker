# springboot-jersey-swagger-docker
Jump Starter for a project with Spring boot, Jersey, Swagger and docker


## build project



```shell
./mvnm clean install
```

## create image docker

```shell
./mvnm docker:build
```

## Run container

Create and start an container

```shell
./mvnm docker:start
```

Strop and remove container

```shell
./mvnm docker:stop
```