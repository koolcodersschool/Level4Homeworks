package office_hours_4;

public class Sum13 {
	
	/*
	 	Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
		sum13([1, 2, 2, 1]) → 6
		sum13([1, 1]) → 2
		sum13([1, 2, 2, 1, 13]) → 6
	 */
	
	public int sum13(int[] nums) {
		  int sum13 = 0;
		  
		  if(nums.length > 0){
		    for(int i = 0; i < nums.length; i++){
		      if(nums[i] == 13){
		        i++;
		        continue;
		      }
		      sum13 += nums[i];
		    }
		  }
		  
		  return sum13;
		}

}
