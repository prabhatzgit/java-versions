package jdk8.predicate;

import java.util.function.Predicate;

public class TestAndPredicate {

	public static void main(String[] args) {
		// 1- lambda expression to evaluate number is EVEN using Predicate FI
		Predicate<Integer> p1 = i -> i % 2 == 0;
		// 2- lambda expression to evaluate number is greater than 35 using Predicate FI
		Predicate<Integer> p2 = i -> i > 35;

		// set of numbers for our demo
		int numbers[] = { 25, 35, 50, 60, 75, 90, 100 };

		for (int number : numbers) {
			if (p1.and(p2).test(number)) {
				System.out.println(number + " is EVEN as well as greater than 35");
			}
			if (p1.or(p2).test(number)) {
				System.out.println(number + " is OR as well as greater than 35");
			}
			if(p1.negate().test(number)) {
                System.out.println(number + " is ODD number");
            }
		}
	}

}