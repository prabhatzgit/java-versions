package jdk7.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramCounter {
    public static void main(String[] args) {
        String text = "xxorfxdofr";
        String word = "for";
        countAnagrams(text, word);
    }

    private static void countAnagrams(String text, String word) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        int windowStart = 0;
        Map<Character, Integer> windowMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < text.length(); windowEnd++) { // text = xxorfxdofr
            char rightChar = text.charAt(windowEnd); // rightChar = x
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1); // (x, x)

            if (windowEnd >= word.length() - 1) {
                if (windowMap.equals(wordMap)) {
                    count++;
                }

                char leftChar = text.charAt(windowStart);
                if (windowMap.get(leftChar) == 1) {
                    windowMap.remove(leftChar);
                } else {
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                }
                windowStart++;
            }
        }
    }
}