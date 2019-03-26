public class RepeatednTimes {

	public static int repeatedNTime(int[] A) {
		
		int arrSize = A.length;
		
		for (int i = 0; i < arrSize - 2; i++) {
			
			if (A[i] == A[i + 1] || A[i] == A[i + 2])
				return A[i];
		}
		
		return A[arrSize - 1];
		
	}
	
	public static void main(String[] args) {
		
		int[] A = {1,2,3,3};
		System.out.println(repeatedNTime(A));
		
		int[] a = {2, 1, 3, 2};
		System.out.println(repeatedNTime(a));
	}
}
