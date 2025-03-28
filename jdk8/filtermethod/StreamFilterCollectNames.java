package jdk8.filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollectNames {

	public static void main(String[] args) {
		// String
		List<String> names = Arrays.asList("Sachin", "Rahul", "Sehwag", "Anil", "Sourav", "Sunil", "Laxman");

		// filter names with length greater than 5
		List<String> newList = names.stream(). // 1. get stream
				filter(s -> s.length() > 5). // 2. intermediate operation filtering
				collect(Collectors.toList()); // 3. collecting to List
		newList.forEach(System.out::println);
	}

}