package in.co.decimal.functionalp.pojo;

import java.util.List;

public class StreamIntermidateOperation {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 5, 3, 8, 3, 213, 5, 4, 7);

		// sorted the list: sorted()
		SortedList(list);
		System.out.println();

		// print the distinct element from the list: distinct()
		printDistinctElement(list);
		System.out.println();

		// print the distinct element in the sorted order from the list:distinct()
		printTheDistinctElementInSortedOrder(list);
		System.out.println();

		// print the distinct element of square in the list: map()
		printDistinctNumberSquareOfTheList(list);
		System.out.println();

		// print the distinct element of square in the sorted order in the list: map()
		printTheDistinctNumberSquareInSortedOrder(list);

	}

	public static void printTheDistinctNumberSquareInSortedOrder(List<Integer> list) {
		list.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}

	public static void printDistinctNumberSquareOfTheList(List<Integer> list) {
		list.stream().distinct().map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}

	public static void printTheDistinctElementInSortedOrder(List<Integer> list) {
		list.stream().distinct().sorted().forEach(element -> System.out.print(element + " "));
	}

	public static void printDistinctElement(List<Integer> list) {
		list.stream().distinct().forEach(element -> System.out.print(element + " "));
	}

	public static void SortedList(List<Integer> list) {
		list.stream().sorted().forEach(element -> System.out.print(element + " "));
	}
}
