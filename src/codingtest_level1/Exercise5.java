package codingtest_level1;

class Exercise5 {
   
	
	public int solution(int[] a, int[] b) {
        int answer = 0;
      
        for(int i=0; i< a.length; i++) {
            answer = answer + a[i]*b[i];
        } // for
        
        return answer;
    } // solution
	
} // end class