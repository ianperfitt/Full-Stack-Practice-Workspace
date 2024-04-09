import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static int findMin(int[] arr) {
	       
	        int i = 0;
	        int j = 1;
	        int minAD = Integer.MAX_VALUE;

	        while(j < arr.length) {
	            minAD = Math.min(minAD, arr[j] - arr[i]);
	            ++i;
	            ++j;
	       }
	        return minAD;
	    }

	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
	        Arrays.sort(arr);

	        int minAD = 0;
	        minAD = findMin(arr);

			int i = 0;
			List<List<Integer>> solution = new ArrayList<>();

			for (int j = 1; j < arr.length; j++) {
				while ((arr[j] - arr[i] != minAD) && (i != j - 1)) {
					++i;
				}

				if (arr[j] - arr[i] == minAD) {
					Integer[] entry = new Integer[2];
					entry[0] = arr[i];
					entry[1] = arr[j];
					solution.add(Arrays.asList(entry));
				}
			}

			return solution;    
	    }

	public static void main(String[] args) {

		int[] arr = { 1,3,6,10,15 };

		System.out.println(minimumAbsDifference(arr));

	}

}
