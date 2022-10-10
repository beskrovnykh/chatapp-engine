# camunda engine spring boot unit test template

This git repository contains a simple example of how to write a unit tests for camunda bpm using spring boot.
You can use it for reporting bugs or asking questions in the forums.

The project contains the following files:

    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── org
    │   │   │       └── camunda
    │   │   │           └── getstarted
    │   │   │               └── MainApplication.java
    │   │   └── resources
    │   │       ├── application.yaml (2)
    │   │       └── process.bpmn (4)
    │   └── test
    │       ├── java
    │       │   └── org
    │       │       └── camunda
    │       │           └── getstarted
    │       │               └── MainApplicationTest.java (1)
    │       └── resources
    │           ├── application.yaml (3)
    │           └── logback-test.xml

```
Explanation:

* (1) A java class annotated with @SpringBootTest containing a JUnit Test. It uses the `AbstractProcessEngineRuleTest` for bootstrapping the process engine, as well as [camunda-bpm-assert][assert] to make your test life easier.
* (2) Configuration file for the process engine application.
* (3) Configuration file for the test application.
* (4) An example BPMN process.
* (5) Logback configuration file.

## Running the test with maven

In order to run the testsuite with maven you can say:

```
mvn clean test
```

## Importing the project into eclipse.

If you use eclipse you can simply import the project by selecting `File / Import |-> Existing Maven Projects.

[assert]: https://github.com/camunda/camunda-bpm-assert

## License
The source files in this repository are made available under the [Apache License Version 2.0](./LICENSE).