package codingtest_level1;

class Exercise21 {
   
	
	public String solution(int n) {
        String answer = "";
     
        if(n%2==0){
           
        	for(int i=1; i<=n/2; i++) {
                answer += "수박";
            } // for
        	
        } else{
            
        	for(int i=1; i<=n/2; i++) {
                answer += "수박";
            } // for
        	
            answer += "수";
        } // if-else
        
        return answer;
    } // solution
	
} // end class