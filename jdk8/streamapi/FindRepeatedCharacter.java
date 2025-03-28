package jdk8.streamapi;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharacter {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c", "c"};

// to print the repeated string

//        Stream.of(strArray)
//                .collect(Comparator.comparing(Function.identity(), Collectors.counting()))
//                .filter(map -> map.getValue(ch) > 1)
//                .forEach((key, value) -> System.out::println(key + " \t" + value));

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < strArray.length; i++) {
            if(hashMap.containsKey(strArray[i].charAt(0))){
                hashMap.put(strArray[i].charAt(0), hashMap.get(strArray[i].charAt(0))+1);
            }else {
                hashMap.put(strArray[i].charAt(0), 1);
            }

        }
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > 1) {

            }

        }
    }
}
