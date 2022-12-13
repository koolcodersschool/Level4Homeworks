package office_hours_1;

public class DoubleChar {
	
	/*
	Given a string, return a string where for every char in the original, there are two chars.
	doubleChar("The") → "TThhee"
	doubleChar("AAbb") → "AAAAbbbb"
	doubleChar("Hi-There") → "HHii--TThheerree"

	*/
	
	public String doubleChar(String str) {
		  String doubleChar = "";
		  for(int i = 0; i < str.length(); i++){
		    doubleChar += str.substring(i,i+1) + str.substring(i,i+1);
		  }
		  return doubleChar;
	}
	

}
