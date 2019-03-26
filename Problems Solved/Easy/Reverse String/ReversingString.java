public class ReversingString {

	public static void reverseString(char[] s) {
		
		int N = s.length;
		
		for (int i = 0; i < N/2; i++) {
			
			char tmp = s[i];
			s[i] = s[N - 1 - i];
			s[N - i - 1] = tmp;
		}
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		char[] test = {'h','e','l','l','o'};
		System.out.print("Before reversing array: ");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]);
		}

		System.out.print("\nAfter reversing array:  ");
		reverseString(test);
		
		char[] test2 = {'b','a','r','c','e','l','o','n','a'};
		System.out.print("Before reversing array: ");
		for (int i = 0; i < test2.length; i++) {
			System.out.print(test2[i]);
		}
		System.out.print("\nAfter reversing array:  ");
		reverseString(test2);
		
		
	}
}
