package jdk8.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Java is a powerful language";
        Integer length = Arrays.stream(str.trim().split("\\s+")).reduce((a, b) -> b).map(String::length).orElse(0);
        System.out.println(length);

        List<String> stringsWithCommas = new ArrayList<>();
        stringsWithCommas.add("Improve your Habits");
        stringsWithCommas.add("I have no idea");
        stringsWithCommas.add("The matter is clear");
        stringsWithCommas.add("You are a Glutton");
        stringsWithCommas.add("It's up to you");

        stringsWithCommas
                .stream()
                .map(st -> st.split("\\s"))
                .peek(strArr -> System.out.println(strArr[strArr.length - 1]))
                .map(strArr -> strArr[strArr.length - 1].length())
                .forEach(System.out::println);
    }
}
