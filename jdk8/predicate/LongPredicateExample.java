package jdk8.predicate;

import java.util.function.LongPredicate;

public class LongPredicateExample {

	public static void main(String[] args) {
		LongPredicate lp = longNum -> longNum >= 0;
		// testing for different numbers using above lambda expression
		System.out.println("1. Whether 10 is postive number : " + lp.test(10));
		System.out.println("2. Whether -7 is postive number : " + lp.test(-7));
		System.out.println("3. Whether 19 is postive number : " + lp.test(19));
		System.out.println("4. Whether -32 is postive number : " + lp.test(-32));
		System.out.println("5. Whether 41 is postive number : " + lp.test(41));
	}

}