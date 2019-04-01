import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
	    
		List<String> str = new ArrayList<String>();
		String tmp = null;
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				
				str.add("FizzBuzz");
			}
			else if (i % 5 == 0) {
				
				str.add("Buzz");
			}
			else if (i % 3 == 0) {
			
				str.add("Fizz");
			}
			else {
				
				tmp = (Integer.valueOf(i).toString());
				str.add(tmp);
			}
		}
		return str;
    }
	
	public static void main(String[] args) {
		
		int n = 15;
		System.out.println(fizzBuzz(n));
	}
}
