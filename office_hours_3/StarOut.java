package office_hours_3;

public class StarOut {
	
	/*
	 Return a version of the given string, where for every star (*) in the string
	 the star and the chars immediately to its left and right are gone. 
	 So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
		starOut("ab*cd") → "ad"
		starOut("ab**cd") → "ad"
		starOut("sm*eilly") → "silly"
	 */
	public String starOut(String str) {
		  String starOut = "";
		  
		  for(int i = 0; i < str.length(); i++){
		    if(i == 0 && str.charAt(i) != '*'){
		      starOut += str.charAt(i);
		    }
		    
		    if(i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*'){
		      starOut += str.charAt(i);
		    }
		    
		    if(i > 0 && str.charAt(i) ==  '*' && str.charAt(i-1) != '*'){
		      starOut = starOut.substring(0, starOut.length()-1);
		    } 
		    
		  }

		  return starOut;
		}


}
