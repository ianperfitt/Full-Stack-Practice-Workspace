import java.util.HashMap;
import java.util.Map;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> map = new HashMap<>();
		int count = 0;

		for (char c : magazine.toCharArray()) {
			if (map.containsKey(c)) {
				count = map.get(c) - 1;
				if (count == 0) {
					map.remove(c);
				} else {
					map.put(c, count);
				}
			}

		}
		return map.isEmpty();
	}
}