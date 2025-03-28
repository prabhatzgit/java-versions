package jdk8.functon;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {

	public static void main(String[] args) {
		ToLongBiFunction<String, String> tlbf = (s1, s2) -> (Long.parseLong(s1) + Long.parseLong(s2)) / 2;
		// test above lambda with numbers
		System.out.println("1. Average of 5 and 7 : " + tlbf.applyAsLong("5", "7"));

		System.out.println("2. Average of 25 and 75 : " + tlbf.applyAsLong("25", "75"));

		System.out.println("3. Average of 963 and 741 : " + tlbf.applyAsLong("963", "741"));

		System.out.println("4. Average of 1234 and 4312 : " + tlbf.applyAsLong("1234", "4312"));

		System.out.println("5. Average of 54872 and 65148 : " + tlbf.applyAsLong("54872", "65148"));

		System.out.println("6. Average of 102365 and 95685 : " + tlbf.applyAsLong("102365", "956855"));
	}

}