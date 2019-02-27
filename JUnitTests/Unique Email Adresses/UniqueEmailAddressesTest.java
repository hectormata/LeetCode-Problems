import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyLevel.UniqueEmailAddresses;


public class UniqueEmailAddressesTest {

	@Test
	public void testForOutput() {
		
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
		 "testemail+david@lee.tcode.com"};
		int expectedOutputCheck = 0;
		expectedOutputCheck = UniqueEmailAddresses.numUniqueEmails(emails);
		assertEquals(3, expectedOutputCheck);
	}

	@Test
	public void testForOutput1() {
		
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
		 "testemail+david@lee.tcode.com"};
		int expectedOutputCheck = 0;
		expectedOutputCheck = UniqueEmailAddresses.numUniqueEmails(emails);
		assertEquals(0, expectedOutputCheck);
	}
	
	@Test
	public void testForOutputFail() {
		
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
		 "testemail+david@lee.tcode.com"};
		int expectedOutputCheck = 0;
		expectedOutputCheck = UniqueEmailAddresses.numUniqueEmails(emails);
		assertEquals(2, expectedOutputCheck);
	}
	
}
