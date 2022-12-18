package office_hours_2;

public class RepeatEnd {
	
	/*
	 Given a string and an int n, return a string made of n repetitions of the last n 
	 characters of the string. You may assume that n is between 0 and the length of 
	 the string, inclusive.
	repeatEnd("Hello", 3) → "llollollo"
	repeatEnd("Hello", 2) → "lolo"
	repeatEnd("Hello", 1) → "o"

	 */
	
	public String repeatEnd(String str, int n) {
		  String repeatEnd = "";
		  if(n >= 0 && n <= str.length()){
		    for(int i = 0; i < n; i++){
		      repeatEnd += str.substring(str.length()-n);
		    }
		  }
		  
		  return repeatEnd;
		}

}
