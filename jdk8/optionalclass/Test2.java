package jdk8.optionalclass;

import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        // Case 4
        // String nameToBeUsed = name.orElse("NA");

        // Case 5
        String nameToBeUsed = name.orElse("Shyam");
        System.out.println(nameToBeUsed);
    }

    private static Optional<String> getName(int id) {
        // Case 4
        // return Optional.empty();

        // Case 5
        return Optional.of("Shyam");
    }
}

// TODO: orElseGet() and orElseThrow()
// TODO: optional.map()
