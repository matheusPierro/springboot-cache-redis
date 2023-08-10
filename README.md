# Ecommerce with springboot, cache and redis

This project aims to explore cache configuration in Spring Boot applications with Redis using JDK17.
An e-commerce system that queries products using cache to optimize query time.

## Starting

To run the project, you will need to install the following programs:

- JDK 17: Required to run the Java project
- Maven: Necessary to perform the build of the Java project
- IDE of your choice for project development

## Development

For development, it is necessary to clone the GitHub project in a directory of your choice, for example:

``` shell
cd "your preferred directory"
git clone https://github.com/matheusPierro/springboot-cache-redis.git
```

### Construction

To build the project with Maven, run the commands below after updating dependencies on your local machine:

``` shell
mvn clean install
```

The command will download all project dependencies and create a *target* directory with the built artifacts, which include the project jar file. In addition, unit tests will be executed (if any), and if any fail, Maven will display this information in the console.

## Features

### Branch before-Integration-redis

Application without the use of cache where it is possible to identify the processing time and performance usage when querying your database:

![image](https://github.com/matheusPierro/springboot-cache-redis/assets/81262972/e7b3a173-9a95-4091-8e16-edb57ab1b226)

### Branch integration-spring-cache

Application with the use of cache in memory, being visible that after the first processing of a product, it is saved in memory, avoiding repeated query actions in its database. Thus increasing processing speed and improving application performance:

![image](https://github.com/matheusPierro/springboot-cache-redis/assets/81262972/3768ce52-3bac-43f3-8c28-159f465c10f2)

### Branch master

Integration of the famous Redis Bank in the application. We upload it to a docker container (this way we will have less problems with installation and configuration on the local machine) to implement and observe its utilities for the application.
Example command to load docker image: docker run --name my-redis -p 6379:6379 -d redis

When making the first query, it is possible to see the use of the cache in standard memory seen above (it processed even faster):

![image](https://github.com/matheusPierro/springboot-cache-redis/assets/81262972/03465e81-bcc1-4f19-a127-1bbf7f9d4282)

Now notice that from the second query, everything is stored in redis and it manages to return all the data stored in the cache, which makes it easier for the application where it doesn't even need to make any queries:

![image](https://github.com/matheusPierro/springboot-cache-redis/assets/81262972/eae70a56-af78-4090-adc1-0246ed37cbfc)

## Settings

To run the project, it is necessary to use Eclipse, so that it identifies the necessary dependencies for execution in the Maven .m2 repository. Once the project is imported, a *.classpath* file will be created that will inform the main class for execution.

## Tests

- Not applicable.

## Contributions

Contributions are always welcome! To contribute always remember to add tests for the new classes with the proper documentation.

## Links

- Not applicable.

## License

Not applicable.
