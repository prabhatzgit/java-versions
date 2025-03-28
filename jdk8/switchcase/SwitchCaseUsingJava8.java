package jdk8.switchcase;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SwitchCaseUsingJava8 {
    public static void main(String[] args) {
        int a, b, r;
        a = 10;
        b = 20;
        // int input = 1; --> Java7
        //String input = "Add"; --> can able to add String and enum using jdk 8
        enum input {Add, Sub, Mul, Div}
        ;

        switch (input.Add) {
            case Add:
                System.out.println(a + b);
                break;
            case Sub:
                System.out.println(a - b);
                break;
            case Mul:
                System.out.println(a * b);
                break;
            case Div:
                System.out.println(a / b);
                break;
        }

        r = switch (input.Add) {
            case Add -> a + b;
            case Sub -> a - b;
            case Mul -> a * b;
            case Div -> a / b;
            default -> -1;
        };
        System.out.println("Result : " + r);

        String day="Wed";
        String result = switch (day) {
            case "Mon","Tue","Wed", "Thu", "Fri" -> "Working Day";
            case "Sat","Sun" -> "Non Working Day";
            default -> "Invalid Day";
        };
        System.out.println(result);

        // pattern matching
//        Object object = "100";
//        String patternResult = switch (object) {
//            case Integer i -> "Integer value";
//            case String s -> "String value";
//            default -> "Unknown";
//        };
//        System.out.println(patternResult);
    }
}
