package codingtest_level1;

class Exercise17 {
  
	
	public long solution(long n) {
        long answer = -1;
      
        for(long i=1; i <= (int) Math.sqrt(n); i++) {
           
        	if(n == i*i) {
                answer = (i+1)*(i+1);
                break;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class
