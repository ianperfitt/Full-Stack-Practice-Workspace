<<<<<<< HEAD
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
=======
public class Solution {

	public static int maxNumberOfBalloons(String text) {
		int bCount = 0;
		int aCount = 0;
		int lCount = 0;
		int oCount = 0;
		int nCount = 0;

		for (Character c : text.toCharArray()) {
			if (c == 'b') {
				bCount++;
			}
			if (c == 'a') {
				aCount++;
			}
			if (c == 'l') {
				lCount++;
			}
			if (c == 'o') {
				oCount++;
			}
			if (c == 'n') {
				nCount++;
			}
		}
		
		lCount = lCount / 2;
		oCount = oCount / 2;

		return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
>>>>>>> bc3495ae49c57f8cb827df3dfa3c5ca1510d0966
	}
}