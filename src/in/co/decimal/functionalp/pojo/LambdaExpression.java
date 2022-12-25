package in.co.decimal.functionalp.pojo;

import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// sum of list using functional programming:
		int sum = sumOfListFP(list);

		System.out.println(sum);

		// sorted the list using functional programming:
		sortedTheListUsingFP(list);

	}



	public static int sumOfListFP(List<Integer> list) {
		return list.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

	public static int sumOfListFP1(List<Integer> list) {
		return list.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	public static void sortedTheListUsingFP(List<Integer> list) {
		list.stream().sorted().forEach(element -> System.out.println(element));
	}
}
