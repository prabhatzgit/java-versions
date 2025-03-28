package jdk8.fiandlambda;

@FunctionalInterface
public interface TestExtendedInterface {
    /*If we extend an interface in another functional interface,
    then multiple abstract method will arise problem and
    not treat as FI and treat as common FI.*/
    void test();
}
