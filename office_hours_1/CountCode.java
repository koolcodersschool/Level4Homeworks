package office_hours_1;

public class CountCode {
	
	/*
	Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	countCode("aaacodebbb") → 1
	countCode("codexxcode") → 2
	countCode("cozexxcope") → 2
	*/
	
	public int countCode(String str) {
	  int countCode = 0;
	  for(int i = 0; i < str.length(); i++){
	    if((i+3) < str.length()){
	      
	      if(str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e'){
	        countCode++;
	      }
	      
	    }
	  }
	  
	  
	  return countCode;
	}

}
