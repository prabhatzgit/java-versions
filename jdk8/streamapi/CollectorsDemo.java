package jdk8.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //  Collectors is a utility class like Arrays, Collections etc
        // provides a set of methods to create common collectors

        // Collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Elie", "Fred", "George");
        List<String> response = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(response);

        // Collecting to a set
        List<Integer> numberList = Arrays.asList(10,20,10,40,60,60,20,20,30);
        Set<Integer> set = numberList.stream().collect(Collectors.toSet());
        System.out.println(set);

        // Collecting to a collection
        ArrayList<String> nameArrayList = names.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(nameArrayList);

        // joining strings
        // concatenated stream elements into a single string
        String concatenatedString = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedString);

        // Summarizing data
        // Generates statistical summary (count, sum, min, average, max)
        IntSummaryStatistics statistics = numberList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+statistics.getCount());
        System.out.println("Sum: "+statistics.getSum());
        System.out.println("Min: "+statistics.getMin());
        System.out.println("Max: "+statistics.getMax());
        System.out.println("Average: "+statistics.getAverage());

        // find average
        Double average = numberList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: "+average);

        // Counting elements
        long count = numberList.stream().collect(Collectors.counting());
        System.out.println("Count: "+count);

        // grouping elements
        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // Partitioning strings
        // partitions elements into two groups (true or false) based on predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // mapping and collecting
        // applies a mapping function before collecting

        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
        // Example 1: Collecting names by length
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Elie");
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
        // Example 2: counting word occurrences
        String sentence = "Hello World Hello Java8 World";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x)));
        // downstream collector
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: Partitioning even and odd numbers
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        // Example 4: Summing values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Orange", 20);
        items.put("Pear", 30);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summarizingInt(x -> x)));

        // Example 5: Creating a Map from stream elements
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        // {apple, 5} -> key : apple, value : length of apple, here before collecting needs to do transformation
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(words.stream().collect(Collectors.toMap(k -> k, v -> 1, (x,y) -> (x+y) )));
    }
}
