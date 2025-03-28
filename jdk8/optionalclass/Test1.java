package jdk8.optionalclass;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        // Case1 : id = 1 and get data from db with this id
        //String name = getName(2);

        // case2
        // null check validation
        // this is very difficult to do in web application with
        // a lot of parameter
//        if (name != null) {
//            System.out.println(name.toUpperCase());
//        }
        // case3
        Optional<String> name = getName(2);
        if (name.isPresent()) {
            System.out.println(name.get());
        }
        name.ifPresent(System.out::println);
    }

    // case3: return data type is Optional
    private static Optional<String> getName(int id) {
        // assume we are fetching id from db

        // Case1 : id = 1 and get data "Ram" from db with this id
        // return "Ram";

        // case2
        // return null;

        // case3
        String name = "Ram";
        // return Optional.of(name); // Null pointer exception
        return Optional.ofNullable(name);
    }
}
