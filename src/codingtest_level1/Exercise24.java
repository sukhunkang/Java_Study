package codingtest_level1;

class Exercise24 {
   
	
	public int solution(long num) {
        int answer = -1;
        int count = 0;
        
        while(num!=1) {
          
        	if(num%2==0) {
                num=num/2;
            } else {
                num=num*3+1;
            } // if-else
        	
            count++;
        } // while
        
        if(count<500) {
            answer=count;
        } // if
        
        return answer;
    } // solution
	
} // end class
