package codingtest_level1;

class Exercise6 {
   
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
    
        for(int i=0; i<absolutes.length; i++) {
        
        	if(signs[i]==false) {
                absolutes[i] = -absolutes[i];
            } // if
        	
        } // for
        
        for(int i=0; i<absolutes.length; i++) {
            answer += absolutes[i];
        } // for
        
        return answer;
    } // solution
	
} // end class
