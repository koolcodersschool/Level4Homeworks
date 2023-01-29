package office_hours_5;

public class No14 {
	
	/*
	 Given an array of ints, return true if it contains no 1's or it contains no 4's.
	no14([1, 2, 3]) → true
	no14([1, 2, 3, 4]) → false
	no14([2, 3, 4]) → true
	 */
	
	public boolean no14(int[] nums) {
		  boolean no14 = true;
		  int one = 0;
		  int four = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i] == 1){
		      one++;
		    }
		    if(nums[i] == 4){
		      four++;
		    }
		    
		  }
		  if(one > 0 && four >0){
		    no14 = false;
		  }
		  
		  
		  return no14;
		}

}
