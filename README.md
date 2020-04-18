## Spring Base

This example shows how to configure the beans in the Spring using Annotations.  

The @Component Annotation defines a class as a bean.\
Component-scan should be added to XML file.

The @Autowire Annotation scan the classpath for a implementation of the mentioned interface and inject it on the bean.\
There are three ways to autowire a component:

- By constructor (recommended for mandatory dependencies)
- By setters (recommended for optional dependencies)
- By field (not recommended)

If there are more than one implementation for the dependency, it should be specified by using the @Qualifier Annotation.\
When autowiring by constructor the @Qualifier Annotation should be passed as parameter. 

### Bean Lifecycle

Container Started > Bean Instantiated > Dependencies Injected > Internal Spring Processing > Custom Init Method(Hook) > Bean Ready For Use > Custom Destroy Method(Hook) > STOP

To define the bean scope, just use the annotation @Scope("prototype").\
It's not necessary to define a singleton scope as it is implicit.

The hook methods are triggered by the @PostConstruct and @PreDestroy Annotations above the desired method.\
The common return type used in hook methods is void as the return can't be captured.\
They can have any access modifier and name, but has to be no-arg.\
Note: @PreDestroy method is not called when using "prototype" scope.

PS: In Java 9+ javax.annotation were removed from the default classpath. So it should be added to be used.