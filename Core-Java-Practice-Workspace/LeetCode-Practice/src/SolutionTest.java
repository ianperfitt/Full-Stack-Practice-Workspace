
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;

	private List<List<String>> s;

	@BeforeEach
	public void setUp() {
		solution = new Solution();
		s = new ArrayList<List<String>>();
	}

	@Test
	void shouldContainNonZeroAnswer() {
		List<String> arr1 = new ArrayList<>();
		List<String> arr2 = new ArrayList<>();
		List<String> arr3 = new ArrayList<>();

		arr1.add("bat");
		s.add(arr1);

		arr2.add("nat");
		arr2.add("tan");
		s.add(arr2);

		arr3.add("ate");
		arr3.add("eat");
		arr3.add("tea");
		s.add(arr3);

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		assertThat(s, Matchers.containsInAnyOrder(solution.groupAnagrams(strs)));
	}

	@Test
	void shouldContainEmptyString() {
		List<String> arr = new ArrayList<>();
		arr.add("");
		s.add(arr);

		String[] strs = { "" };
		assertEquals(s, solution.groupAnagrams(strs));
	}

	@Test
	void shouldContainSingleString() {
		List<String> arr = new ArrayList<>();
		arr.add("a");
		s.add(arr);

		String[] strs = { "a" };
		assertEquals(s, solution.groupAnagrams(strs));
	}
}