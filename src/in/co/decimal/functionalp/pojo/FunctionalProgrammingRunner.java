package in.co.decimal.functionalp.pojo;

import java.util.List;


public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Rat", "Repeat");
		printBasicWithFunctionalPFiltering(list);
	}

	public static void printBasic(List<String> list) {
		for (String str : list) {
			System.out.print(str + " ");
		}
	}
	
	public static void printBasicWithFiltering(List<String> list) {
		for (String str : list) {
			if (str.endsWith("at")) {
				System.out.print(str + " ");
			}
		}
	}

	public static void printBasicFunctionalP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	
	public static void printBasicWithFunctionalPFiltering(List<String> list) {
		list.stream()
		.filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println(element));
	}

}
