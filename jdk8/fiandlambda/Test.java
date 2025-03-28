package jdk8.fiandlambda;

public class Test {
    public static void main(String[] args) {
        //MyFunction myFunction = (i) -> System.out.println("test method executed...");
        //myFunction.test(15);

        //MyFunction myFunction = (i) -> i*50;
        //System.out.println(myFunction.test(15));

        MyFunction myFunction = (s1, s2) -> s1 + ":" + s2;
        System.out.println(myFunction.test("S1", "S2"));
    }
}
