package office_hours_8;

public class Has22 {
	
	/*
	 Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
	 has22([1, 2, 2]) → true
	 has22([1, 2, 1, 2]) → false
	 has22([2, 1, 2]) → false
	 */
	
	public boolean has22(int[] nums) {
	  boolean has22 = false;
	  String str = "";
	  for(int i = 0; i < nums.length; i++){
	    str += nums[i];
	  }
	  if(str.contains("22")){
	    has22 = true;
	  }
	  
	  
	  
	  return has22;
	}

}
