import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int findMaxLength(int[] nums) {

		Set<Integer> zeroCountSet = new HashSet<Integer>();
		Set<Integer> oneCountSet = new HashSet<Integer>();
		int zeroCount = 0;
		int oneCount = 0;
		int max = 0;

		for (int i : nums) {
			if (i == 1) {
				oneCountSet.add(++oneCount);
			} else {
				zeroCountSet.add(++zeroCount);
			}
		}

		if (oneCountSet.isEmpty() || zeroCountSet.isEmpty()) {
			return 0;
		}

		for (int i : zeroCountSet) {
			if (oneCountSet.contains(i) && i > max) {
				max = i;
			}
		}

		return max * 2;
	}
}