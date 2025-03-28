package jdk8.duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAndCountDuplicateValuesOfHashMap {

    public static void main(String[] args) {
        Map<String, Double> playerPercentile = new HashMap<>();
        playerPercentile.put("Morgan", 99.67);
        playerPercentile.put("Stewart", 90.98);
        playerPercentile.put("Mike", 93.65);
        playerPercentile.put("Cook", 91.67);
        playerPercentile.put("Stokes", 92.35);
        playerPercentile.put("Broad", 99.67);
        playerPercentile.put("Pietersen", 92.35);
        playerPercentile.put("Hussain", 94.89);
        playerPercentile.put("Collingwood", 92.35);
        playerPercentile.put("Flintoff", 93.65);
        playerPercentile.put("Strauss", 91.67);
        playerPercentile.put("Butler", 99.67);

        System.out.println("\n original map entries \n");
        playerPercentile.forEach((key, value) -> System.out.println(key + " \t" + value));

        System.out.println("\n Player's percentile and its duplicate count \n");
        Map<Double, Long> playersPercentileCount = playerPercentile
                .values()
                .stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        playersPercentileCount.forEach((key, value) -> System.out.println(key + " \t" + value));

        System.out.println("\n Player's percentile count more than 2 \n");

        playerPercentile
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 2)
                .forEach(System.out::println);

        // Before Java8
        Map<Double, Integer> playersPercentileCount1 = new HashMap<>();
        for(Map.Entry<Double, Long> entrySet : playersPercentileCount.entrySet()){
        if(playersPercentileCount1.containsKey(entrySet.getValue())){
            playersPercentileCount1.put(Double.valueOf(entrySet.getValue()), (playersPercentileCount1.get(entrySet.getValue())+1));
        }else{
            playersPercentileCount1.put(Double.valueOf(entrySet.getValue()), 1);
        }
        }

    }
}
