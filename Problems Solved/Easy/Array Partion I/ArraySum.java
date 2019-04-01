import java.util.Arrays;

public class ArraySum {
    public static int arrayPairSum(int[] nums) {
        
    	if (nums.length <= 1 || nums == null) {
    		
    		return 0;
    	}
    	
    	Arrays.sort(nums);
    	long result = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (i % 2 == 0) {
    			result += nums[i];
    		}
    		else {
    			result += 0;
    		}
    	}
    	
    	return (int) result;
    }
    
    public static void main(String[] args) {
	
    	int[] input = {1, 4, 3, 2};
    	System.out.println(arrayPairSum(input));
	}
}
