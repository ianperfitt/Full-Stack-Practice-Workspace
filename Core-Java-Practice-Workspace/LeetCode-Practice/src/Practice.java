import java.util.Arrays;

public class Practice {

	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
		int numItems = 0;
		for (int[] b : boxTypes) {
			if (b[0] < truckSize) {
				numItems = numItems + (b[0] * b[1]);
				truckSize = truckSize - b[0];
			}

			// b[0] > trucksize
			else {
				numItems = numItems + (truckSize * b[1]);
				truckSize = 0;
			}

			if (truckSize == 0) {
				return numItems;
			}
		}
		return numItems;

	}

	public static void main(String[] args) {
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};

		int truckSize = 10;
		System.out.println(maximumUnits(boxTypes, truckSize));

	}

}
