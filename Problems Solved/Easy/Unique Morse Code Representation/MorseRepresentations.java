import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MorseRepresentations {

	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	static String[] moreCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.",
			"....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
			".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	static Map<Character, String> conversion = new HashMap<Character, String>();

	public static Map<Character, String> inititalizeMap() {
		
		char[] tmp = alphabet.toCharArray();
		
		for (int i = 0; i < tmp.length; i++) {
				
				conversion.put(tmp[i], moreCode[i]);

		}

		return conversion;
		
		
	}
	public static int uniqueMorseRepresentations(String[] words) {
		char[] tmp = null;
		Set<String> endResult = new HashSet<String>();
		

		for (String x : words) {
			StringBuilder endP = new StringBuilder();
			tmp = x.toCharArray();
			
			for (int i = 0; i < tmp.length; i++) {
				
					endP.append(conversion.get(tmp[i]));

			}
			endResult.add(endP.toString());
		}

		return endResult.size();
		
	}
	
	public static void main(String[] args) {
		
		String[] words = {"gin", "zen", "gig", "msg"};
		
		
		inititalizeMap();
		System.out.println(uniqueMorseRepresentations(words));
	}
}
