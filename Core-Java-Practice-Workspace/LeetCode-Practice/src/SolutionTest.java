import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
<<<<<<< HEAD
	void shouldEqualTwoEqualOnesAndZeros() {
		int[] arr = { 0, 1 };
		Solution solution = new Solution();

		assertEquals(2, solution.findMaxLength(arr));
	}

	@Test
	void shouldEqualTwoNonEqualOnesAndZeroes() {
		int[] arr = { 0, 1, 0 };
		Solution solution = new Solution();

		assertEquals(2, solution.findMaxLength(arr));
	}

	@Test
	void shouldEqualFour() {
		int[] arr = { 0, 1, 1, 0, 1, 1, 1, 0 };
		Solution solution = new Solution();

		assertEquals(4, solution.findMaxLength(arr));
	}
//
//	@Test
//	void largestUniqueIsOnlyElement() {
//		int[] arr = { 0 };
//		Solution solution = new Solution();
//
//		assertEquals(0, solution.findMaxLength(arr));
//	}
}
=======
	void shouldEqualZero() {
		int solution = Solution.maxNumberOfBalloons("baloon");
		assertEquals(0, solution);
	}

	@Test
	void shouldEqualOne() {
		int solution = Solution.maxNumberOfBalloons("baloon");
		assertEquals(0, solution);
	}

}
>>>>>>> bc3495ae49c57f8cb827df3dfa3c5ca1510d0966
