## Spring Base

This example shows how to configure the beans in the Spring using Annotations.  

The @Component Annotation defines a class as a bean.\
<context:component-scan ...> should be added to XML file.

The @Autowire Annotation scan the classpath for a implementation of the mentioned interface and inject it on the bean.\
There are three ways to autowire a component:

- By constructor (recommended for mandatory dependencies)
- By setters (recommended for optional dependencies)
- By field (not recommended)

If there are more than one implementation for the dependency, it should be specified by using the @Qualifier Annotation.\
When autowiring by constructor the @Qualifier Annotation should be passed as parameter. 

Configuring the beans without a XML file can be done by creating a java class with @Configuration annotation.\
In the same file, use the @ComponentScan("package")[1]\
Call the application context by using AnnotationConfigApplicationContext in the main class.\
Use @PropertySource(file) if external values are required.

[1] Instead of using @ComponentScan, the beans can be explicit defined with @Bean at the Config class.\
In this case, the Implementation should be instantiated, and the return type should be the Interface.\
See SportConf.java for more information.

### Bean Lifecycle

Container Started > Bean Instantiated > Dependencies Injected > Internal Spring Processing > Custom Init Method(Hook) > Bean Ready For Use > Custom Destroy Method(Hook) > STOP

To define the bean scope, just use the annotation @Scope("prototype").\
It's not necessary to define a singleton scope as it is implicit.

The hook methods are triggered by the @PostConstruct and @PreDestroy Annotations above the desired method.\
The common return type used in hook methods is void as the return can't be captured.\
They can have any access modifier and name, but has to be no-arg.\
Note: @PreDestroy method is not called when using "prototype" scope.

PS: In Java 9+ javax.annotation were removed from the default classpath. So it should be added manually to be used.
