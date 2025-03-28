package jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

public class TestMR {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 4, 6, 8, 9, 10);
        // >4 -> 23, 6, 8, 9, 10 // 6, 8, 9, 10, 23
        // static method reference
        list.stream().filter(t -> t > 4).sorted().forEach(TestMR::printElement);
        // instance method reference
        TestMR testMR = new TestMR();
        list.stream().filter(t -> t > 4).sorted().forEach(testMR::printInstanceElement);
    }

    public static void printElement(int i){
        System.out.println(i);
    }

    public void printInstanceElement(int i){
        System.out.println(i);
    }
}
