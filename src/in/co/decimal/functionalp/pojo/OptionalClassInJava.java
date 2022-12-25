package in.co.decimal.functionalp.pojo;

import java.util.List;
import java.util.Optional;

public class OptionalClassInJava {
	public static void main(String[] args) {

		// find the max with optional:
		Optional<Integer> max = findMaxOptional();

		System.out.println(max);

		// find the max without optional:
		int max1 = findMaxWithOutOptional();
		System.out.println(max1);

	}

	public static Integer findMaxWithOutOptional() {
		return List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.get();
	}

	public static Optional<Integer> findMaxOptional() {
		return List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2));
	}
}
