package jdk8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        // Intermediate operations transforms a stream into another stream
        // They are lazy, meaning that they don't execute until a terminal operation
        // is invoked
        List<String> nameList = Arrays.asList("Prabhat", "Ranjan", "Prabhat", "Mahanty");
        // Intermediate operations transforms a stream into another stream
        Stream<String> filteredStream = nameList.stream().filter(x -> x.startsWith("P"));
        // They are lazy, meaning that they don't execute until a terminal operation
        // is invoked
        filteredStream.forEach(System.out::println);
        // this above stream not filtered until terminal operation not initiated its execution.
        // no filtering at this point nameList.stream().filter(x -> x.startsWith("P"));

        long count = nameList.stream().filter(x -> x.startsWith("R")).count();

        // map
        Stream<String> stringStream = nameList.stream().map(String::toUpperCase);

        // sorted
        Stream<String> sortedStream = nameList.stream().sorted();
        Stream<String> sortedStreamUsingComparator = nameList.stream().sorted((a, b) -> a.length() - b.length());

        // distinct
        System.out.println(nameList.stream().filter(x -> x.startsWith("P")).distinct().count());

        // limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());

        // peek
        // performs an action on each element as it is consumed
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        // flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // flatten nested structures (lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("Kiwi","Guava"),
                Arrays.asList("pear","Grapes")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

        // convert sentences into word with uppercase
        List<String> sentences = Arrays.asList("Hello World", "Java streams are powerful","flatmap is useful");
        System.out.println(sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase).toList());
    }
}
