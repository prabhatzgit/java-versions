package jdk8.comparator.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingIntegerList {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(63, 19, 86, 97, 7, 10, 67);
		// 1.1 print to console
		System.out.println("Original numbers as per Insertion-order :- \n");
		integerList.forEach(i -> System.out.println(i));

		// 2. sorting in ascending order
		System.out.println("\nAscending order sorted numbers" + " using Comparator.naturalOrder() :- \n");
		integerList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		// 3. sorting in descending order
		System.out.println("\nDescending order sorted numbers" + " using Comparator.reverseOrder() :- \n");
		integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}