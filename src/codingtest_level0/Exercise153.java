package codingtest_level0;

class Exercise153 {
    
	
	public int[] solution(int n) {
        int[] answer = {};
        int k=0;
        k=n;
        int count = 0;
        
        while(n!=1) {
           
        	if(n%2 != 0) {
                n = 3*n + 1;
                count++;
            } else {
                n = n/2;
                count++;
            } // if-else
        	
        } // while
       
        n=k;
        
        answer = new int[count+1];
        answer[0]=n;
       
        for(int i=1; i<count+1; i++) {
           
        	if(n%2 != 0) {
                n = 3*n + 1;
                answer[i]=n;
            } else {
                n = n/2;
                answer[i]=n;
            } // if-else
        	
        } // for
        
        return answer;
    } // solution
	
} // end class