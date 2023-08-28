package codingtest_level1;

class Exercise7 {
   
	
	public int solution(int n) {
        int answer = 0;
       
        for(int i=1; i<=n; i++) {
          
        	if(n%i==0) {
                answer += i;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class