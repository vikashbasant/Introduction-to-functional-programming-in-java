package in.co.decimal.functionalp.pojo;

import java.util.List;

public class FilteringRunner {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

		// For odd Integer element:
		list.stream().filter(element -> element % 2 == 1).forEach(element -> System.out.println(element));

		// For even Integer element:
		list.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));

		// sum of list element:
		int sum = sumOfList(list);
		System.out.println(sum);

		// sum of list element using functional programming:
		int sumFP = sumOfListElementUsingFunctionalProgramming(list);
		System.out.println(sumFP);

		// sum of odd number from the list using functional programming:
		int sumOdd = list.stream().filter(element -> element % 2 != 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println(sumOdd);

		// sum of even number from the list using functional programming:
		int sumEven = list.stream().filter(element -> element % 2 == 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println(sumEven);

	}

	public static int sumOfListElementUsingFunctionalProgramming(List<Integer> list) {
		return list.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	public static int sumOfList(List<Integer> list) {
		int sum = 0;
		for (Integer ele : list) {
			sum += ele;
		}
		return sum;
	}
}
