package jdk8.filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMultipleFilters {

	public static void main(String[] args) {
		// String names
		List<String> names = Arrays.asList("Sachin", "Rahul", "Sehwag", "Anil", "Sourav", "Sunil", "Laxman");

		// filter names with length greater than 5
		List<String> newList = names.stream() // 1. get stream
				.filter(s -> s.length() > 5 && s.startsWith("S")) // 2 filtering
				.collect(Collectors.toList()); // 3. collecting to List

		// print to console using forEach
		newList.forEach(System.out::println);
	}

}