package jdk7.statiknonstatic;

public class Test {
    static {
        System.out.println("First");
    }

    public int i = 10;

    public Test() {
        System.out.println("Constructor");
    }

    {
        m1();
        System.out.println("Second");
    }

    public static void main(String[] args) {

        System.out.println("Main Method start");
        Test test = new Test();
        System.out.println("Main Method end");

    }

    public void m1() {
        System.out.println("j = " + j);
    }

    {
        System.out.println("Third");
    }

    public int j = 20;
}
