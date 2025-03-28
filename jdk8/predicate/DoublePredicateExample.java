package jdk8.predicate;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {

	public static void main(String[] args) {
		// lambda expression for DoublePredicate to check CGPA is greater than 6.7
		DoublePredicate dp = d -> d >= 6.7;

		// testing for different numbers using above lambda expression
		System.out.println("1. Whether Suresh passed with CGPA of 9.2 : " + dp.test(9.2));
		System.out.println("2. Whether Naresh passed with CGPA of 4.3 : " + dp.test(4.3));
		System.out.println("3. Whether Rajesh passed with CGPA of 7.9 : " + dp.test(7.9));
		System.out.println("4. Whether Ramesh passed with CGPA of 5.4 : " + dp.test(5.4));
		System.out.println("5. Whether Lokesh passed with CGPA of 6.8 : " + dp.test(6.8));
	}

}