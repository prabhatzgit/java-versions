package jdk7.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        String[] anagrams = {"ATE", "EAT", "BAT", "TEA", "EAR", "ARE"};
        HashMap<String, List<String>> anagramsMap = new HashMap<>();

        // iterate the string array
        for(int i = 0; i < anagrams.length; i++) {
            //get each string
            String word = anagrams[i];
            // convert the string to char array
            char[] letters = word.toCharArray();
            // sort the char array
            Arrays.sort(letters);
            // create the string
            String sortedLetters = new String(letters);
            // check if sorted string present in map or not
            // if present, then get the value and add word
            if(anagramsMap.containsKey(sortedLetters)) {
                anagramsMap.get(sortedLetters).add(word);
            }else {
                List<String> words = new ArrayList<>();
                words.add(word);
                anagramsMap.put(sortedLetters, words);
            }
        }
        for(String s : anagramsMap.keySet()) {
            List<String> values = anagramsMap.get(s);
            if(values.size() > 1) {
                System.out.println(values);
            }
        }
    }

}
