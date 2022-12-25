package in.co.decimal.functionalp.pojo;

import java.util.List;
import java.util.stream.IntStream;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		// sum of first 10 number:
		int sum = sumOfFirst10No();
		System.out.println(sum);

		// find the maximum number from the list:
		int maxNo = findMaximumNo();
		System.out.println(maxNo);

		// find the minimum number form the list;
		int minNo = findMinimumNO();
		System.out.println(minNo);
	}

	public static int findMinimumNO() {
		int minNo = List.of(23, 12, 34, 53).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		return minNo;
	}

	public static int findMaximumNo() {
		return List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
	}

	public static int sumOfFirst10No() {
		return IntStream.range(1, 11).reduce(0, (number1, number2) -> number1 + number2);
	}
}
