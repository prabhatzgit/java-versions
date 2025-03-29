//package jdk17.switchstatementsenhancements;
//
//public class ReturningValuesFromSwitchStatement {
//
//    static String formatter(Object object) {
//        // pattern matching : passing an object to the switch statements
//        return switch (object) {
//            case Integer i -> "Integer" + i;
//            case String s -> "String" + s;
//            case null -> "null value";
//            default -> "Unknown Type";
//        };
//    }
//
//    static String classifyNumber(Number number) {
//        // pattern matching : passing an object to the switch statements
//        return switch (number) {
//            case Integer i -> i % 2 == 0 ? "Even integer" : "Odd integer";
//            case Double d -> d > 0 ? "Positive double" : "Negative double";
//            default -> "Unknown number";
//        };
//    }
//
//    public static void main(String[] args) {
//        // returning some sort of values based on Object types
//        String formatterValue = formatter(25);
//        System.out.println("formatterValue" + formatterValue);
//
//        String classifyNumberValue = classifyNumber(25);
//        System.out.println("classifyValue" + classifyNumberValue);
//
//        String classifyDoubleValue = classifyNumber(25);
//        System.out.println("classifyValue" + classifyDoubleValue);
//
//    }
//}
// feature upgraded to jdk 21
