package codingtest_level1;

class Exercise18 {
   
	
	public long solution(int a, int b) {
        long answer = 0;
        
        if(a>b) {
          
        	for(int i=b; i<=a; i++) {
                answer += i;
            } // for
        	
        } else if(b>a) {
         
        	for(int i=a; i<=b; i++) {
                answer += i;
            } // for
        	
        } else {
            answer = a;
        } // if-else

        return answer;
    } // solution
	
} // end class