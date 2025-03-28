package jdk7.string;

public class TestString {
    public static void main(String[] args) {
        String stringLiteral = "literal string";
        String stringObject = new String("object string");
        System.out.println(stringLiteral == stringObject);
        System.out.println(stringLiteral.equals(stringObject));

        System.out.println(stringLiteral.hashCode());
        System.out.println(stringObject.hashCode());

        String s1 = "Prabhat";
        String s2 = "Prabhat";
        String s3 = new String("Prabhat");
        String s4 = "Ranjan";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false

        String s5 = "PRABHAT";
        System.out.println(s1.equals(s5)); // false
        System.out.println(s1.equalsIgnoreCase(s5));

        // The == operator compares references not values.
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        String s6 = "Prabha";
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s6));
        System.out.println(s6.compareTo(s2));
    }
}
