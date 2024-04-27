import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int largestUniqueNumber(int[] nums) {

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int i : nums) {
			countMap.put(i, countMap.getOrDefault(i, 0) + 1);
		}

		int largestUnique = -1;
		for (Integer i : countMap.keySet()) {
			if (countMap.get(i) == 1 && i > largestUnique) {
				largestUnique = i;
			}
		}
		return largestUnique;
	}
}