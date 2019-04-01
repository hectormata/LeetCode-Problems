package EasyLevel;

/*
 * Given a word, you need to judge whether the usage of capitals in it is right
 *  or not. We define the usage of capitals in a word to be right when one of 
 *  the following cases holds:
 *  
 *  All letters in this word are capitals, like "USA".
 *  All letters in this word are not capitals, like "leetcode".
 *  
 *  Only the first letter in this word is capital if it has more than one 
 *  letter, like "Google".
 *  
 *  Otherwise, we define that this word doesn't use capitals in a right way.
 *  
 *  Example 1:
 *  Input: "USA"
 *  Output: True
 *  
 *  Example 2:
 *  Input: "FlaG"
 *  Output: False
 *  Note: The input will be a non-empty word consisting of uppercase and 
 *  lowercase Latin letters.
 */
public class DetectCapitalUse {

	public static boolean detectCapitalUse(String word) {
		
		if (word.length() == 0 || word == null) {
			return false;
		}
		
		int size = word.length();
		int tmpNum = 0;
		
		for (int i = 0; i < size; i++) {
			
			// Keep track of how many upper cases in the word
			if (Character.isUpperCase(word.charAt(i))) {
				tmpNum++;
			}
			
		}
		
		// If the first letter is upper case only - return true
		if (tmpNum == 1) {
			return Character.isUpperCase(word.charAt(0));
		}
	
		// Check if all chars are capital or if there are not any chars
		return tmpNum == 0 || tmpNum == word.length();
	}
	
	public static void main(String[] args) {
		
		String s0 = "USA";
		String s1 = "FLaG";
		String s2 = "Google";
		
		System.out.printf("Doing the first word ( %s ):\n",s0 );
		System.out.println(detectCapitalUse(s0));
		
		System.out.printf("Doing the first word ( %s ):\n",s1 );
		System.out.println(detectCapitalUse(s1));
		
		System.out.printf("Doing the first word ( %s ):\n",s2 );
		System.out.println(detectCapitalUse(s2));
	}
}
