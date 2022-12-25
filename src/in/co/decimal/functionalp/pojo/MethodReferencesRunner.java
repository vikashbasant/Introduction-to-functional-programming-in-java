package in.co.decimal.functionalp.pojo;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		// .forEach(s -> System.out.println(s));
		// .forEach(System.out::println);
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		// .forEach(s -> System.out.println(s));
		// .forEach(System.out::println);
		// .forEach(MethodReferencesRunner::print);
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(MethodReferencesRunner::print);

		// .forEach(s -> System.out.println(s));
		// .forEach(System.out::println);
		// .forEach(MethodReferencesRunner::print);
		// .map(String::length)
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(34, 23, 33, 57).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare).orElse(0);

		System.out.println(max);

	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
}
