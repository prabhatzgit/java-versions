package jdk8.fiandlambda;

public class AccessFI {
    public static void main(String[] args) {
        FI callFI = (a, b) -> a+b;
        int result = callFI.add(2,5);
        System.out.println(result);
    }
}
