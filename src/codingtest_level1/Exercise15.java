package codingtest_level1;

class Exercise15 {
   
	
	public String solution(String s) {
        String answer = "";
    
        if(s.length() % 2 == 1) {
            answer = s.substring( (s.length()+1)/2 -1  , (s.length()+1)/2);
        } else {
            answer = s.substring( s.length()/2 -1 , s.length()/2 + 1 );
        } // if-else
        
        return answer;
    } // solution
	
} // end class
