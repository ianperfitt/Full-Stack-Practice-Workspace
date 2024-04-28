import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
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