package office_hours_2;

public class SameStarChar {
	/*
	 
	Returns true if for every '*' (star) in the string, if there are chars both 
	immediately before and after the star, they are the same.
	sameStarChar("xy*yzz") → true
	sameStarChar("xy*zzz") → false
	sameStarChar("*xa*az") → true
	 */
	
	
	public boolean sameStarChar(String str) {
		  boolean sameStarChar = true;
		  for(int i = 0, j = 0; i < str.length()-1; i++){
		    if(str.charAt(i) == '*'){
		      if(str.charAt(j) == str.charAt(i+1)){
		        sameStarChar = true;
		      }else{
		        sameStarChar = false;
		      }
		    }
		    if(i > 0){
		      j++;
		    }
		  }
		  return sameStarChar;
		}

}
