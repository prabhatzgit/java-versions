package jdk8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // for each
        list.stream().forEach(x -> System.out.println(x));

        // reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x+y);
        // .reduce((x, y) -> x+y); same as .reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x ->x %2 ==0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x >0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);

        // findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // Filtering and Collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(name -> name.length() > 3).toList());

        // Squaring and Sorting numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // Summing values
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        // counting occurrences of character
        String sentence = "This is a test";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // stateful and stateless
        // 1. stateful : operation which should know all parameters to
        // perform its operation. For ex: sorted()
        // 2. stateless : operation which looks only one parameter at a time.
        // It doesn't worry or focus on its previous or post elements
        // ex: map(x -> x*x) --> only looks to square up an element at a time
        // no need to know all elements to perform its operation

        // toArray
        // it will convert a stream into an array and terminate its operation
        System.out.println(Arrays.toString(Stream.of(1, 2, 4, 5).toArray()));

        // min/max
        System.out.println(Stream.of(2,44,59).max((o1, o2) -> o1 - o2));
        System.out.println(Stream.of(2,44,59).max(Comparator.naturalOrder()));
        System.out.println(Stream.of(2,44,59).min((o1, o2) -> o1 - o2));
        System.out.println(Stream.of(2,44,59).min(Comparator.naturalOrder()));

        // example
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println); // once the stream will use for each, it will consume or operate or closed
        // List<String> list1 = stream.map(String::toUpperCase).toList();
        // System.out.println("list1" + list1); uncomment and run above code
        // Stream has already been linked or consumed. So, exception will come
        // Exception in thread "main" java.lang.IllegalStateException:
        // stream has already been operated upon or closed

        // forEachOrdered
        List<Integer> numberList = Arrays.asList(10,20,30,40,50,60,70,80,90);
        System.out.println("Using for each with parallel stream");
        numberList.parallelStream().forEach(System.out::println);
        System.out.println("Using for each ordered with parallel stream");
        numberList.parallelStream().forEachOrdered(System.out::println);

        System.out.println("Using for each with stream");
        numberList.stream().forEach(System.out::println);
        System.out.println("Using for each ordered with stream");
        numberList.stream().forEachOrdered(System.out::println);
    }
}
