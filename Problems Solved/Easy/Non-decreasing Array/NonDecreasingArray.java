public class NonDecreasingArray {

	public static boolean checkPossibility(int[] nums) {
		
		if (nums == null || nums.length < 0) {
			return false;
		}
		
		else if (nums.length <= 2) {
			return true;
		}
		
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i] > nums[i + 1]) {
				
				if (i >= 1 && nums[i - 1] < nums[i + 1]) {
					nums[i] = nums[i + 1];
				}
				else if (i >= 1 && nums[i - 1] > nums[i + 1]) {
					nums[i + 1] = nums[i];
				}
				
				count++;
			}
			
			if (count >= 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {4, 2, 3};
		
		System.out.println(checkPossibility(input));
		
		int[] input1 = {4, 2, 1};
		System.out.println(checkPossibility(input1));
	}

}
