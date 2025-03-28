package jdk8.predicate;

import java.util.function.Predicate;

public class TestStringLength {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 7;
		// testing number using Predicate
		System.out.println("1. Whether 'Prabhat' contains length > 7 : " + predicate.test("Prabhat"));

		System.out.println("2. Whether 'Java 8' contains length > 7 \t: " + predicate.test("Java 8"));

		System.out.println("3. Whether 'Anushka' contains length > 7 \t: " + predicate.test("Anushka"));

		System.out.println("4. Whether 'Tendulkar' contains length > 7 \t: " + predicate.test("Tendulkar"));

		System.out.println("5. Whether 'Madhavan' contains length > 7 \t: " + predicate.test("Madhavan") + "\n");

		// lambda expression to evaluate check name starts with 'R' using Predicate FI
		Predicate<String> p = s -> s.startsWith("R");

		String[] names = { "Virat Kohli", "Rohit Sharma", "Ravindra Jadeja", "Jasprit Bumrah", "Lokesh Rahul",
				"Hardik Pandya", "Rishabh Pant" };

		// testing number using Predicate
		for (String name : names) {
			System.out.println("Whether '" + name + "' starts with 'R' : \t" + p.test(name));
		}
	}

}