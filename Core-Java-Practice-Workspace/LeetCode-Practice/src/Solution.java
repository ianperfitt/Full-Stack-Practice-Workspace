import java.util.HashSet;
import java.util.Set;

class Solution {

	public static int lengthOfLongestSubstring(String s) {

		Set<Character> tracker = new HashSet<>();
		int solution = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char c = s.charAt(j);

				if (tracker.contains(s.charAt(j))) {
					break;
				} else {
					solution = Math.max(solution, j - i + 1);
					tracker.add(c);
				}
			}
			tracker.clear();
		}
		return solution;
	}
}
