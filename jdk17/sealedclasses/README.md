### This feature allows to define classes with a restricted set of subclasses, improving type safety and code organization.
### that means sealed classes can be used to restrict the set of subclasses of an interface or class, improving type safety and code organization.

1. We define a sealed interface Shape that declares a method area().
2. We create three final classes Circle, Rectangle, and Triangle that implement the Shape interface and provide their respective area calculations.
3. We create instances of each shape and calculate their areas.
4. We attempt to create an instance of an invalid class InvalidShape 
(which doesn't exist in this example), but it won't compile because Shape is sealed and only allows the specified subclasses.


### before using java17

# strategy design pattern
### Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

Key Differences:
Interfaces: Allow multiple unrelated classes to implement the same method, promoting polymorphism and code reuse.
Abstract Classes: Require subclasses to provide implementations for abstract methods, enforcing a common contract.
Sealed Classes: Restrict subclass creation to a predefined set, ensuring type safety and control over the class hierarchy.