# Design Patterns Written In Java

## Summary of Creational Patterns

 - **The Factory Pattern** is used to choose and return an instance of a class from a number of similar classes based on data you provide to the factory.  
 - **The Abstract Factory Pattern** is used to return one of several groups of classes. In some cases it actually returns a Factory for that group of classes.  
 - **The Builder Pattern** assembles a number of objects to make a new object, based on the data with which it is presented. Frequently, the choice of which way the objects are assembled is achieved using a Factory.  
 - **The Prototype Pattern** copies or clones an existing class rather than creating a new instance when creating new instances is more expensive.  
 - **The Singleton Pattern** is a pattern that insures there is one and only one instance of an object, and that it is possible to obtain global access to that one instance.

 ## SUMMARY OF STRUCTURAL PATTERNS
 - **The Adapter pattern**, used to change the interface of one class to that of another one.  
 - **The Bridge pattern**, intended to keep the interface to your client program constant while allowing you to change the actual kind of class you display or use. You can then change the interface and the underlying class separately.  
 - **The Composite pattern**, a collection of objects, any one of which may be either itself a Composite, or just a primitive object.  
 - **The Decorator pattern**, a class that surrounds a given class, adds new capabilities to it, and passes all the unchanged methods to the underlying class.  
 - **The Façade pattern**, which groups a complex object hierarchy and provides a new, simpler interface to access those data.  
 - **The Flyweight pattern**, which provides a way to limit the proliferation of small, similar class instances by moving some of the class data outside the class and passing it in during various execution methods.  
 - **The Proxy pattern**, which provides a simple place-holder class for a more complex class which is expensive to instantiate.

## SUMMARY OF BEHAVIORAL PATTERNS
 - The **Observer pattern** defines the way a number of classes can be notified of a change,  
 - The **Mediator** defines how communication between classes can be simplified by using another class to keep all classes from having to know about each other.  
 - The **Chain of Responsibility** allows an even further decoupling between classes, by passing a request between classes until it is recognized.  
 - The **Template pattern** provides an abstract definition of an algorithm,  
 - The **Interpreter** provides a definition of how to include language elements
in a program.  
- The **Strategy pattern** encapsulates an algorithm inside a class,  
- The **Visitor pattern** adds function to a class,  
- The **State pattern** provides a memory for a class’s instance variables.  
- The **Command pattern** provides a simple way to separate execution of a command from the interface environment that produced it, and  
- The **Iterator pattern** formalizes the way we move through a list of data within a class.