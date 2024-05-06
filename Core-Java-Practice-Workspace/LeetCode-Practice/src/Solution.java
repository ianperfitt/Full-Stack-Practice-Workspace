import java.util.HashMap;
import java.util.Map;

class Solution {
	public int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> tracker = new HashMap<>();

		char c = 'a';
		int count = 0;
		int solution = 0;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (!tracker.containsKey(c)) {
				tracker.put(c, tracker.getOrDefault(c, 0) + 1);
			} else {
				tracker.put(c, tracker.get(c) + 1);
				solution = Math.max(count, count - tracker.get(c) + 1);
			}
			++count;
		}

		return 0;
	}
}