import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setup() {
		solution = new Solution();
	}

	@Test
	void shouldEqualFalse() {
		String ransomNote = "a";
		String magazine = "b";

		assertEquals(false, solution.canConstruct(ransomNote, magazine));
	}

	@Test
	void shouldEqualFalseAlso() {
		String ransomNote = "aa";
		String magazine = "ab";

		assertEquals(false, solution.canConstruct(ransomNote, magazine));
	}

	@Test
	void shouldEqualTrue() {
		String ransomNote = "aa";
		String magazine = "aab";

		assertEquals(true, solution.canConstruct(ransomNote, magazine));
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