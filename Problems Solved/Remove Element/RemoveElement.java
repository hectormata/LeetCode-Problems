public class RemoveElement {

	public static int removeElements(int[] nums, int val) {
		
		int size = nums.length;
		int count = 0;
		for (int i = 0; i < size; i++) {
			
			if (nums[i] != val) {
				
				nums[count] = nums[i];
				count++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] test1 = {3, 2, 2, 3};
		int[] test2 = {0, 1, 2, 2, 3, 0, 4, 2};
		
		int valForTest1 = 3;
		int valForTest2 = 2;

		int len = removeElements(test1, valForTest1);
		System.out.println(len);
		System.out.println("Before Loop");
		for (int i = 0; i < len; i++) {
			System.out.print(test1[i]);
		}
		

		int len2 = removeElements(test2, valForTest2);
		System.out.println("\n" + len2);
		System.out.println("Before Loop");
		for (int i = 0; i < len2; i++) {
			System.out.print(test2[i]);
		}
	}
}
