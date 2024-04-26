import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static int numberOfSubarrays(int[] nums, int k) {
		Map<Integer, Integer> counts = new HashMap<>();
		counts.put(0, 1);

		int ans = 0;
		int curr = 0;

		for (int num : nums) {
			curr += num % 2;
			ans += counts.getOrDefault(curr - k, 0);
			counts.put(curr, counts.getOrDefault(curr, 0) + 1);
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 1, 1 };
		System.out.println(numberOfSubarrays(arr, 3));
	}
}