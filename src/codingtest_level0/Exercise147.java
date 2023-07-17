package codingtest_level0;

class Exercise147 {
    
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i=4; i<=n; i++) {
            int count=0;
           
            for(int j=1; j<=i; j++) {
                
            	if(i%j==0) {
                    count++;
                } // if
            	
            } // inner-for
            
            if(count>=3) {
                answer++;
            } // if
            
        } // Outter-for
        
        return answer;
        
    } // solution block
	
} // end class