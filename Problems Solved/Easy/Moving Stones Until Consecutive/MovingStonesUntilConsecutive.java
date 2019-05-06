import java.util.Arrays;

public class MovingStonesUntilConsecutive {

	public static int[] numMovesStones(int a, int b, int c) {
        
		int[] s = { a, b, c };
		Arrays.sort(s);
		if (s[2] - s[0] == 2) return new int[] { 0, 0 };
		return new int[] { Math.min(s[1] - s[0], s[2] - s[1]) <= 2 ? 1 : 2, s[2] - s[0] - 2 };
		
    }
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 5;
		
		int[] z = numMovesStones(a, b, c);
		
		for (int x : z) {
			System.out.println(x);
		}
	}
}
