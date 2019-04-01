
/*
 * Implement function ToLowerCase() that has a string parameter str, and 
 * returns the same string in lowercase.
 * 
 * Example 1:
 * 
 * Input: "Hello"
 * Output: "hello"
 * 
 * Example 2:
 * 
 * Input: "here"
 * Output: "here"
 * 
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class ToLowerCase {
	
	public static String toLowerCaseFunc(String str) {
		
		// ASCII Approach
        char[] a = str.toCharArray();
        for (int i = 0; i<a.length; i++) {
            if ((int) a[i] >= 65 && (int) a[i] <= 90) 
                a[i] = (char) (a[i] + 32);
        }
        
        return new String(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "HELLO";
		System.out.println(toLowerCaseFunc(input));
		
		input = "here";
		System.out.println(toLowerCaseFunc(input));
		
		input = "LOVELY";
		System.out.println(toLowerCaseFunc(input));
		
	}

}
