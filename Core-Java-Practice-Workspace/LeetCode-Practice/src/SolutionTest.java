import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void largestUniqueIsEight() {
		int[] arr = { 5, 7, 3, 9, 4, 9, 8, 3, 1 };
		Solution solution = new Solution();

		assertEquals(8, solution.largestUniqueNumber(arr));
	}

	@Test
	void largestUniqueDoesNotExist() {
		int[] arr = { 9, 9, 8, 8 };
		Solution solution = new Solution();

		assertEquals(-1, solution.largestUniqueNumber(arr));
	}

	@Test
	void largestUniqueIsOnlyElement() {
		int[] arr = { 0 };
		Solution solution = new Solution();

		assertEquals(0, solution.largestUniqueNumber(arr));
	}
}