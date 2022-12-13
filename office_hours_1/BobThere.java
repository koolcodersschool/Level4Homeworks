package office_hours_1;

public class BobThere {
	/*
	Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
	bobThere("abcbob") → true
	bobThere("b9b") → true
	bobThere("bac") → false

	*/
	
	public boolean bobThere(String str) {
	  boolean bobThere = false;
	  for(int i = 0; i < str.length()-2; i++){
	    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
	      bobThere = true;
	    }
	  }
	  
	  
	  
	  return bobThere;
	}

}
