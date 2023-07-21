package codingtest_level0;

class Exercise158 {
  
	
	public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b = sides[1];
        int c = a+b;
        
        
        for(int i=1; i<=c; i++) {
          
        	if(a<b+i && b<i+a && i<a+b) {
                answer++;
            } // if
        	
        } // for
        
        
        return answer;
        
    } // solution
	
} // end class