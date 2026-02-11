# Commit Comparison: Initial commit → Order model + sample endpoint

Compare link: https://github.com/anemdhana/upskilling/compare/65e6e90...d573a53

## What changed (high level)
- Added Spring Boot project scaffold and Maven wrapper
- Added `Order` entity, repository, and sample REST endpoint
- Added project config and tests

## File summary (ignored excluded)
- 11 files changed, 736 insertions(+)
- New files:
  - order-service/.gitattributes
  - order-service/.gitignore
  - order-service/.mvn/wrapper/maven-wrapper.properties
  - order-service/mvnw
  - order-service/mvnw.cmd
  - order-service/pom.xml
  - order-service/src/main/java/com/anem/ewccart/OrderServiceApplication.java
  - order-service/src/main/java/com/anem/ewccart/controller/OrderController.java
  - order-service/src/main/java/com/anem/ewccart/entity/Order.java
  - order-service/src/main/java/com/anem/ewccart/repository/OrderRepository.java
  - order-service/src/test/java/com/anem/ewccart/OrderServiceApplicationTests.java

## Learn & remember
- Scaffold first, then add domain features in small, reviewable commits.
- Keep controllers thin; move data access to repositories.
- Prefer DTOs later; early on, entities are OK for quick scaffolding.
- Use a compare link to speed up PR reviews and learning.