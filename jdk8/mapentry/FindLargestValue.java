package jdk8.mapentry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindLargestValue {
    public static void main(String[] args) {
        Map<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("China", 1409517397);
        countryPopulation.put("India", 1339180127);
        countryPopulation.put("United States", 324459463);
        countryPopulation.put("Indonesia", 263991379);
        countryPopulation.put("Brazil", 209288278);
        countryPopulation.put("Pakistan", 197015955);
        countryPopulation.put("Nigeria", 190886311);

        Map.Entry<String, Integer> entrySet = countryPopulation
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .get();
        System.out.println("Largest value in the map is: " + entrySet.getValue());
    }
}