import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static List<List<Integer>> minimumAbsDifference(int[] arr) {

		Arrays.sort(arr);

		List<List<Integer>> solution = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		int diff = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			diff = arr[i + 1] - arr[i];
			if (diff < min) {
				min = diff;
				solution.clear();
				solution.add(Arrays.asList(arr[i], arr[i + 1]));
			} else if (diff == min) {
				solution.add(Arrays.asList(arr[i], arr[i + 1]));
			}
		}

		return solution;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 8, -10, 23, 19, -4, -14, 27 };
		System.out.println(minimumAbsDifference(arr));

	}

}
