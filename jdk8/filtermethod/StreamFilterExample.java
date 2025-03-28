package jdk8.filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {
		System.out.println("EVEN number from list of first 10 numbers : \n");
		
		// Integer numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Stream<Integer> streams = numbers.stream().filter(i -> i % 2 == 0);
        
        streams.forEach(s -> System.out.println(s));
	}

}