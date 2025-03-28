package jdk8.comparator.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStringList {

	public static void main(String[] args) {
		// 1. List of String elements
		List<String> names = Arrays.asList("Ranbir Kapoor","Sushant Singh Rajput", "Ayusman Khurana", "Hrithik Roshan",
				"Akshay Kumar", "Ranveer Singh");
		
		System.out.println("Original numbers as per Insertion-order :- \n");
		names.forEach(i -> System.out.println(i));

		// 2. sorting in ascending order
		System.out.println("\nAscending order sorted numbers" + " using Comparator.naturalOrder() :- \n");
		names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		// 3. sorting in descending order
		System.out.println("\nDescending order sorted numbers" + " using Comparator.reverseOrder() :- \n");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}