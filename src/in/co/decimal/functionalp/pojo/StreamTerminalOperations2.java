package in.co.decimal.functionalp.pojo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminalOperations2 {
	public static void main(String[] args) {

		// print the odd number from the list:
		printTheOddNumberFormList();

		// Find the odd number from the list and convert into the list:
		List<Integer> list = oddNumberConvertIntoList();
		System.out.println(list);

		// Pick the even number into the list:
		List<Integer> list2 = pickTheEvenIntoTheList();
		System.out.println(list2);

		// Pick the first 10 integer square of the list:
		List<Integer> list3 = first10SquareIntoList();
		System.out.println(list3);
	}

	public static List<Integer> first10SquareIntoList() {
		// here .boxed() is used for convert the IntStream into stream into Integer:
		return IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
	}

	public static List<Integer> pickTheEvenIntoTheList() {
		List<Integer> list2 = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		return list2;
	}

	public static List<Integer> oddNumberConvertIntoList() {
		List<Integer> list = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
		return list;
	}

	public static void printTheOddNumberFormList() {
		List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));
	}
}
