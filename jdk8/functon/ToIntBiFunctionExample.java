package jdk8.functon;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> tibf = (s1, s2) -> s1.length() + s2.length();

		System.out.println("1. Length of Bench and Resources is \t= " + tibf.applyAsInt("Bench", "Resources"));

		System.out.println("2. Length of Oracle and Java is \t= " + tibf.applyAsInt("Oracle", "Java"));

		System.out.println("3. Length of Spring and Boot is \t= " + tibf.applyAsInt("Spring", "Boot"));

		System.out.println("4. Length of IBM and Redhat is \t\t= " + tibf.applyAsInt("IBM", "Redhat"));

		System.out.println("5. Length of Redhat and OpenShift is \t= " + tibf.applyAsInt("Redhat", "OpenShift"));
	}

}