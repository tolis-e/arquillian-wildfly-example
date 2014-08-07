# Arquillian WildFly Example
This project contains an [Arquillian](https://github.com/arquillian) test example which is executed against [WildFly](http://wildfly.org/) application server.

The [Arquillian](http://arquillian.org/) testing platform is used to enable the testing automation. Arquillian integrates transparently with the testing framework which is JUnit in this case.

## Test Content
The Test defines the three core aspects needed for the execution of an [Arquillian](http://arquillian.org/) test case:

- container — the runtime environment
- deployment — the process of dispatching an artifact to a container
- archive — a packaged assembly of code, configuration and resources

The container's configuration resides in the [Arquillian XML](https://github.com/tolis-e/arquillian-wildfly-example/blob/master/src/test/resources/arquillian.xml) configuration file.

The test case is dispatched to the container's environment through coordination with ShrinkWrap, which is used to declaratively define a custom Java EE archive that encapsulates the test class and its dependent resources. Arquillian packages the ShrinkWrap defined archive at runtime and deploys it to the target container. It then negotiates the execution of the test methods and captures the test results using remote communication with the server. Finally, Arquillian undeploys the test archive.

The [POM](https://github.com/tolis-e/arquillian-wildfly-example/blob/master/pom.xml) file contains two profiles:

* arq-wildlfy-managed — managed container 
* arq-wildfly-remote — remote container

By default the arq-wildfly-managed (managed container) profile is active. An Arquillian managed container is a remote container whose lifecycle is managed by Arquillian. The specific profile is also configured to download and unpack the WidlFly 8.1.0.Final distribution zip from the Maven Central repository.

## Test Execution
The execution of the functional test is done through maven:

    mvn test

## Documentation

* [Arquillian Guides](http://arquillian.org/guides/)
