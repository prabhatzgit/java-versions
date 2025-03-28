package jdk8.mapentry;

import java.util.Comparator;
import java.util.Map;

public class FindLargestAndSmallestKey {
    public static void main(String[] args) {
        java.util.Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");
        map.put(11, "k");
        map.put(12, "l");
        map.put(13, "m");
        map.put(14, "n");
        map.put(15, "o");
        map.put(16, "p");
        map.put(17, "q");
        map.put(18, "r");
        map.put(19, "s");
        map.put(20, "t");
        map.put(21, "u");
        map.put(22, "v");
        map.put(23, "w");
        map.put(24, "x");
        map.put(25, "y");
        map.put(26, "z");
        /*java.util.Map.Entry<Integer, String> largest = null;
        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
            if (largest == null || entry.getKey() > largest.getKey()) {
                largest = entry;
            }
        }
        System.out.println(largest);*/
        Map.Entry<Integer, String> entrySet = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .findFirst()
                .orElse(null);
        System.out.println(entrySet.getKey());

        Map.Entry<Integer, String> smallestKey = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .findFirst().orElse(null);
        System.out.println(smallestKey.getKey());

    }
}