package codingtest_level0;

class Exercise168 {
 
	
	public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
          
        	if(!answer.contains(my_string.substring(i,i+1))) {
                answer += my_string.substring(i,i+1);
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class