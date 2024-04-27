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
	}
}