package jdk8.functionalinterfaces;

public class FuncInterfaceImpl implements FuncInterface {
    @Override
    public void funcA() {
        System.out.println("single abstract method of a functional interface called with use of implementation class");
    }
}
