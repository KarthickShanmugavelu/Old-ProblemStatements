package array_problem_statement;

import java.util.ArrayList;
import java.util.List;

public class ArraySolution {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 7, 5 };
		int n = 5, s = 12;
		ArrayList<Integer> result = new ArrayList<>();
		if (n == 0) {
			result.add(-1);
		}
		if (n == 1 && arr[0] == s) {
			result.add(-1);
		}
		if (s == 0) {
			result.add(-1);
		}
		if (s == 1 && arr[0] > 1) {
			result.add(-1);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			if (arr[i] == s) {
				result.add(i + 1);
				result.add(i + 1);
				break;
			}
			if (arr[i] > s) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum > s) {
					break;
				}
				if (sum == s) {
					result.add(i + 1);
					result.add(j + 1);
					break;
				}
			}
			sum = 0;
			if (result.size() > 0) {
				break;
			}
		}
		if (result.size() == 0) {
			result.add(-1);
		}

		System.out.println(result);
	}

}
