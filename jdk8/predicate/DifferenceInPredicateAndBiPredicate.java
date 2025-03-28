package jdk8.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DifferenceInPredicateAndBiPredicate {

	public static void main(String[] args) {
		// 1. Predicate - lambda expression to check number is greater than 10
		Predicate<Integer> p = (i) -> i > 10;

		// 2. BiPredicate - lambda expression to check sum is greater than 10
		BiPredicate<Integer, Integer> bp = (i, j) -> (i + j) > 10;

		// 1.A test for Predicate
		System.out.println("Predicate testing : \n");

		System.out.println("1. Whether 8 is greater than 10 \t: " + p.test(8));

		System.out.println("2. Whether 19 is greater than 10 \t: " + p.test(19));

		// 2.A test for BiPredicate
		System.out.println("\nBiPredicate testing : \n");

		System.out.println("1. Whether sum of (10, 6) is greater than 10 \t: " + bp.test(10, 6));

		System.out.println("2. Whether sum of (7, 3) is greater than 10 \t: " + bp.test(7, 3));
	}

}