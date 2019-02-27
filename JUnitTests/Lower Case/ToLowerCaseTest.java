import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyLevel.ToLowerCase;

public class ToLowerCaseTest {

	@Test
	public void testForOutput() {
		
		String expectedOutputCheck = "";
		expectedOutputCheck = ToLowerCase.toLowerCaseFunc("HELLO");
		assertEquals("hello", expectedOutputCheck);
	}

	@Test
	public void testForOutput1() {
		
		String expectedOutputCheck = "";
		expectedOutputCheck = ToLowerCase.toLowerCaseFunc("here");
		assertEquals("here", expectedOutputCheck);
	}
	
	@Test
	public void testForOutputFail() {
		
		String expectedOutputCheck = "";
		expectedOutputCheck = ToLowerCase.toLowerCaseFunc("LOVELY");
		assertEquals("lovely", expectedOutputCheck);
	}
}
