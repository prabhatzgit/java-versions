package jdk8.filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterNames {

	public static void main(String[] args) {
		// String
		List<String> names = Arrays.asList("Sachin", "Rahul", "Sehwag", "Anil", "Sourav", "Sunil", "Laxman");

		// filter names with length greater than 5
		Stream<String> streams = names.stream().filter(s -> s.length() > 5);
		streams.forEach(s -> System.out.println(s));
	}

}