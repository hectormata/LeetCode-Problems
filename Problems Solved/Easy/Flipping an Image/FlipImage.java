/*
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is 
 * replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Example 2:
 * 
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * 
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 * 
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * 
 */
public class FlipImage {

	public static int[][] flipAndInvertImage(int[][] A) {
		
		if (A.length == 0 || A == null) {
			return A;
		}
		
		int size = A.length;
		
		for (int i = 0; i < size / 2 + size % 2; i++) {
			for (int j = 0; j < size; j++) {
				int tmp = A[j][i];
				A[j][i] = A[j][size - 1 - i] ^ 1;
				A[j][size - 1 - i] = tmp ^ 1;
			}
		}
		return A;
		
	}
	
	public static void main(String[] args) {
		
		int[][] input = {{1,1,0},
						 {1,0,1},
						 {0,0,0}};
		
		int[][] result = flipAndInvertImage(input);
		
		for (int[] tmp : result) {
			for (int tmp2 : tmp) 
			System.out.println(tmp2);
		}
	}
}