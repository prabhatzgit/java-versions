package jdk7.string;

public class CheckString {
    public static void main(String[] args) {
        String stringLiteral1 = "Prabhat";
        String stringLiteral2 = "Prabhat";
        String stringObject1 = new String("Prabhat");
        String stringObject2 = new String("Prabhat");

        // Comparing string literals
        // stringLiteral1 and stringLiteral2 point to the same object in the string pool,
        // so stringLiteral1 == stringLiteral2 returns true
        System.out.println(stringLiteral1 == stringLiteral2); // true

        // Comparing string objects
        // stringObject1 and stringObject2 are different objects in the heap,
        // so stringObject1 == stringObject2 returns false
        System.out.println(stringObject1 == stringObject2); // false

        // Comparing string literal with string object
        // stringLiteral1 and stringObject1 are different objects,
        // so stringLiteral1 == stringObject1 returns false
        System.out.println(stringLiteral1 == stringObject1); // false

        // Comparing string values
        // The equals method compares the content of the strings,
        // so stringLiteral1.equals(stringObject1) returns true
        System.out.println(stringLiteral1.equals(stringObject1)); // true
    }
}
