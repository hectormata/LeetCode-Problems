import static org.junit.Assert.assertEquals;
import org.junit.Test;

import EasyLevel.JewelsAndStones;

public class JewelsAndStonesTest {

	@Test
	public void testForOutput() {
		
		int expectedOutputCheck = 0;
		expectedOutputCheck = JewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
		assertEquals(3, expectedOutputCheck);
	}

	@Test
	public void testForOutput1() {
		
		int expectedOutputCheck = 0;
		expectedOutputCheck = JewelsAndStones.numJewelsInStones("z", "ZZ");
		assertEquals(0, expectedOutputCheck);
	}
	
	@Test
	public void testForOutputFail() {
		
		int expectedOutputCheck = 0;
		expectedOutputCheck = JewelsAndStones.numJewelsInStones("za", "ZZacs");
		assertEquals(0, expectedOutputCheck);
	}
}
