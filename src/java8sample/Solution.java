package java8sample;

/*Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/

public class Solution {

	static int[] nums = { 2,11,15,7 };
	static int[] result = new int[2];
	static int target = 9;

	static public int[] twoSum(int[] nums, int target) {
		int sum;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				sum = nums[i] + nums[j];
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No two sum solution");
}

	public static void main(String[] args) {
		int[] arraysumzero = twoSum(nums, target);
	
		  for (int i=0;i<arraysumzero.length; i++){
		 
		 System.out.print("["+arraysumzero[i]+"]");
		  
		  }
		
	}

}
