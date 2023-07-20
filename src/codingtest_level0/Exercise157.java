package codingtest_level0;

class Exercise157 {
    
	
	public String solution(int q, int r, String code) {
		String answer = "";
        
		
		for(int i=0; i<code.length(); i++) {
          
			if(i%q == r) {
                answer += code.charAt(i);
            } // if
			
        } // for
        
        return answer;
        
    } // solution
	
} // end class