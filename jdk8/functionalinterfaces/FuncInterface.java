package jdk8.functionalinterfaces;

@FunctionalInterface
public interface FuncInterface {
    // if we omit public abstract also, funcA() will treat as an abstract method
    public abstract void funcA();
}

// first create a class and implement this interface
// anonymous class for implementing interface