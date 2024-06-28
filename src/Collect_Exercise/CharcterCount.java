package Collect_Exercise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharcterCount {

	public static void main(String[] args) {
		String input = "helll";

		Map<Character, Long> map = input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((character, count) -> {

			if (count > 1) {
				System.out.println(character + " " + count);
			}

		});

	}
}
