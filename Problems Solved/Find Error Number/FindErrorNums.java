public class FindErrorNums {

    public static int[] findErrorNums(int[] nums) {
      
    	int size = nums.length;
    	int[] newArr = new int[2];
    	
    	for (int i : nums) {
    		
    		if (nums[Math.abs(i) - 1] < 0) 
    			newArr[0] = Math.abs(i);
    		else
    			nums[Math.abs(i) - 1] *= -1;
    	}
    	
    	for (int i = 0; i < size; i++) {
    		
    		if (nums[i] > 0)
    			newArr[1] = i + 1;
    	}
    	return newArr;

    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {1,2,2,4};
    	
    	nums = findErrorNums(nums);
    	
    	for (int i : nums) {
    		System.out.println(i);
    	}
    	// System.out.println(findErrorNums(nums));
    }
}
