/*
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have 
 * exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 */
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] defaultResult = {0, 0};
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.get(target - nums[i]) != null) {
//				int[] result = {map.get(target - nums[i]) + 1, i + 1};
				int[] result = {map.get(target - nums[i]), i};
				return result;
			}
			map.put(nums[i], i);
		}
		return defaultResult;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(twoSum(input, target));
	}

}
