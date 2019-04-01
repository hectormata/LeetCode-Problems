/*
 * You're given strings J representing the types of stones that are jewels, 
 * and S representing the stones you have.  Each character in S is a type of 
 * stone you have. You want to know how many of the stones you have are also 
 * jewels. The letters in J are guaranteed distinct, and all characters in J 
 * and S are letters. Letters are case sensitive, so "a" is considered a 
 * different type of stone from "A".
 * 
 * Example 1:
 * 
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * 
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 * 
 */
public class JewelsAndStones {

	public static int numJewelsInStones(String j, String s) {
		
		int output = 0;
		int sizeOfJ = j.length();
		int sizeOfS = s.length();
		
		for (int i = 0; i < sizeOfJ; i++) {
			for (int k = 0; k < sizeOfS; k++) {
				
				if (j.charAt(i) == s.charAt(k)) {
					output = output + 1;
				}
			}
		}
		return output;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strJ = "aA";
		String strS = "aAAbbbb";
		
		if (strJ.length() <= 50 && strS.length() <= 50) {
			System.out.println(numJewelsInStones(strJ, strS));
		}
		else {
			System.err.println("Too many letters - Please use less than 50 letters");
		}
	}
}
