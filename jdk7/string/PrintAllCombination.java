package jdk7.string;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCombination {
    public static void main(String[] args) {
        String str = "abc";
        generateCombinations(str, "");
        generateAllCombinations(str);
    }

    public static List<String> generateAllCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        combinations.add("");

        for (int i = 0; i < input.length(); i++) {
            int size = combinations.size();
            for (int j = 0; j < size; j++) {
                combinations.add(combinations.get(j) + input.charAt(i));
            }
        }
        return combinations;
    }

    public static void generateCombinations(String str, String combination) {
        if (str.isEmpty()) {
            System.out.println(combination);
            return;
        }

        // Include the first character
        generateCombinations(str.substring(1), combination + str.charAt(0));

        // Exclude the first character
        generateCombinations(str.substring(1), combination);
    }
}
