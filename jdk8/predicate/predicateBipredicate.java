package jdk8.predicate;

import java.util.function.BiPredicate;

public class predicateBipredicate {

	public static void main(String[] args) {
		// lambda expression to evaluate sum is EVEN / ODD using BiPredicate FI
		BiPredicate<Integer, Integer> bipredicate = (i, j) -> (i + j) % 2 == 0;
		System.out.println(bipredicate.test(6, 9));
		System.out.println(bipredicate.test(6, 4));
		
		// to evaluate whether 2nd number is divisor of 1st number
		
		BiPredicate<Integer, Integer> bipred = (i, j) -> i%j == 0;
		System.out.println(bipred.test(6, 9));
		System.out.println(bipred.test(6, 3));
	}

}