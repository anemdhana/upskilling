# Getting Started

## Work Done
- Added JPA-backed `Order` entity, repository, and `/orders/sample` endpoint.
- Added PostgreSQL datasource defaults with env var overrides.
- Added startup data loader to insert 3 sample orders when the table is empty.

## TODO
1. Tailor default DB name/user/password to your local Postgres setup.
2. Add a toggle (profile or property) to enable/disable sample data seeding.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.2/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.2/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/4.0.2/reference/web/servlet.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.0.2/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

