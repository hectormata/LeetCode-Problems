public class ArrayByParity {

	public static int[] sortArrayByParity(int[] A) {
		
		if (1 <= A.length && A.length <= 5000 ) {
			int size = A.length;
			int temp;
			for (int i = 0, j = 0; j < size; j++) {
			
				if (A[j] % 2 == 0) {
				
					temp = A[i];
					A[i++] = A[j];
					A[j] = temp;
				}
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		
		int[] input = {3, 1, 2, 4};
		int[] tmp;
		
		tmp = sortArrayByParity(input);
		System.out.println("Array:");
		for (Integer num : tmp ) {
			System.out.println(num);
		}
		
		int[] input2 = {0, 1, 2};
		
		tmp = sortArrayByParity(input2);
		System.out.println("Array:");
		for (Integer num : tmp ) {
			System.out.println(num);
		}		
	}
}
