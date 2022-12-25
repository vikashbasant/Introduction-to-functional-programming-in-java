package in.co.decimal.functionalp.pojo;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class NumberSquaremapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);

	}

}
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {

		return number % 2 == 0;
	}

}

public class FunctionsAreFirstCalssCitizens {

	public static void main(String[] args) {

		// 1. Storing functions in variable.
		// 2. Passing functions to methods.
		// 3. Returning functions from methods.
		Predicate<? super Integer> evenPredicate = evenPredicateMethod();
		Predicate<? super Integer> oddPredicate = oddPredicateMethod();
		List.of(23, 43, 34, 45, 98, 107, 49).stream().filter(evenPredicate).forEach(e -> System.out.println(e));

		// With out used of EvenNumberPredicate:
//		List.of(23, 43, 34, 45, 98, 107, 49).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

		// Uses of EvenNumberPredicate:
		// filter and forEach class used:
//		List.of(23, 43, 34, 45, 98, 107, 49).stream().filter(new EvenNumberPredicate())
//				.forEach(new ForEach());

		// Map class used:
		List.of(1, 2, 3, 4, 5).stream().filter(new EvenNumberPredicate()).map(new NumberSquaremapper())
				.forEach(new SystemOutConsumer());
	}

	public static Predicate<? super Integer> oddPredicateMethod() {
		return n -> n % 2 == 1;
	}

	public static Predicate<? super Integer> evenPredicateMethod() {
		return n -> n % 2 == 0;
	}
}
