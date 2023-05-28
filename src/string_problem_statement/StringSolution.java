package string_problem_statement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		int count = 0;
		for (String subStr : strArr) {
			if (map.keySet().contains(subStr)) {
				count = map.get(subStr);
				map.put(subStr, ++count);
				count = 0;
			} else {
				map.put(subStr, ++count);
				count = 0;
			}
		}
		for (String key : map.keySet()) {
			System.out.println("Word : " + key + " |  No of Occurence: " + map.get(key));
		}

		// Using streams
		Map<String, Integer> map2 = new HashMap<>();
		Arrays.stream(strArr).forEach(x -> {
			if (map2.keySet().contains(x)) {
				int count2 = map2.get(x);
				map2.put(x, ++count2);
			} else {
				map2.put(x,1);
			}

		});
		
		System.out.println("===========Using Streams===========");
		for (String key : map2.keySet()) {
			System.out.println("Word : " + key + " |  No of Occurence: " + map2.get(key));
		}
	}
}
