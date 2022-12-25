package in.co.decimal.functionalp.pojo;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExecrise {

	public static void main(String[] args) {
		// print square of first 10 numbers!
		// clue - IntStream.range(1,10)
		PrintSquareFirst10No();
		System.out.println();

		// List.of("Apple", "Ant", "Bat").stream()
		// Map all of these to lowercase and print them
		ToConvertLowerCase();
		System.out.println();

		// List.of("Apple", "Ant", "Bat").stream()
		// print the length of each element
		printTheLengthOfString();

	}

	public static void printTheLengthOfString() {
		List.of("Apple", "Ant", "Monkey").stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));
	}

	public static void ToConvertLowerCase() {
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
	}

	public static void PrintSquareFirst10No() {
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}
}
