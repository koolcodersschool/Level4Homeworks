package office_hours_2;

public class PrefixAgain {
	
	/*
	 Given a string, consider the prefix string made of the first N chars of the string.
	 Does that prefix string appear somewhere else in the string? 
	 Assume that the string is not empty and that N is in the range 1..str.length().
	prefixAgain("abXYabc", 1) → true
	prefixAgain("abXYabc", 2) → true
	prefixAgain("abXYabc", 3) → false
	 */
	
	public boolean prefixAgain(String str, int n) {
		  boolean prefixAgain = false;
		  String check = str.substring(0,n);
		  if(n > 0 && n < str.length()){
		    if(str.lastIndexOf(check) != str.indexOf(check)){
		      prefixAgain = true;
		    }
		  }
		  
		  
		  return prefixAgain;
		}

}
