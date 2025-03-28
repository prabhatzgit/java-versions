package jdk8.filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapMethod {

	public static void main(String[] args) {
		System.out.println("Filter EVEN numbers and Cube it : \n");

		// Integer numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> newList = numbers.stream().filter(i -> i % 2 == 0).map(n -> n * n * n)
				.collect(Collectors.toList());

		newList.forEach(s -> System.out.println(s));
	}

}