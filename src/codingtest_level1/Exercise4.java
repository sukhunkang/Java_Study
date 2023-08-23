package codingtest_level1;

class Exercise4 {
   
	
	public int solution(int n) {
        int answer = 0;
       
        for(int i=1; i<n; i++) {
          
        	if(n%i == 1) {
                answer = i;
                break;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class
