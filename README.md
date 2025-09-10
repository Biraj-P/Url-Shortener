# Url-Shortener
Guide for the Url-Shortner can be found [here](Tutorial/00_overview.md) (NOTE: Guide is with MySQL, while project is made with PostgreSQL)

* Dockerizing Spring Boot Application
* Run URL Shortener using Docker Compose

```shell
# To build Docker image
$  ./mvnw spring-boot:build-image

# To run the application using Docker Compose
$ cd docker
$ docker compose up -d
```

#Time Zone error
Refer here [here](https://github.com/dbeaver/dbeaver/issues/36487#issuecomment-3265701186)