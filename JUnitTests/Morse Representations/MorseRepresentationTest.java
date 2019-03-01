import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyLevel.MorseRepresentations;

public class MorseRepresentationsTest {

	@Test
	public void testForOutput() {
		
		String[] words = {"gin", "zen", "gig", "msg"};
		int expectedOutputCheck = 0;
		expectedOutputCheck = MorseRepresentations.uniqueMorseRepresentations(words);
		assertEquals(2, expectedOutputCheck);
		
	}
}
