package codingtest_level0;

class Exercise215 {
   
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            answer++;
          
            while(answer%3 ==0 || String.valueOf(answer).contains("3")) {
                answer++;
            } // while
            
        } // for
        
        return answer;
    } // solution
	
} // end class