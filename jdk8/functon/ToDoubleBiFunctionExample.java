package jdk8.functon;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {

	public static void main(String[] args) {
		ToDoubleBiFunction<String, String> tdbf = (s1, s2) -> (Double.parseDouble(s1) + Double.parseDouble(s2)) / 2;

		// test above lambda with numbers
		System.out.println("1. Average of 5 and 7 : " + tdbf.applyAsDouble("5", "7"));

		System.out.println("2. Average of 25 and 76 : " + tdbf.applyAsDouble("25", "76"));

		System.out.println("3. Average of 963 and 755 : " + tdbf.applyAsDouble("963", "755"));

		System.out.println("4. Average of 1235 and 4312 : " + tdbf.applyAsDouble("1235", "4312"));

		System.out.println("5. Average of 54871 and 65148 : " + tdbf.applyAsDouble("54871", "65148"));

		System.out.println("6. Average of 102365 and 95684 : " + tdbf.applyAsDouble("102365", "956854"));
	}

}