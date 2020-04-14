##Spring Base

This example shows how to configure the beans in the Spring using Annotations
The @Component Annotation defines a class as a bean
The @Autowire Annotation scan the classpath for a implementation of the mentioned interface and inject it on the bean.

###Bean Lifecycle

Container Started > Bean Instantiated > Dependencies Injected > Internal Spring Processing > Custom Init Method(Hook) > Bean Ready For Use > Custom Destroy Method(Hook) > STOP