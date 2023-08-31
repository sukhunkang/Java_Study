package codingtest_level1;

class Exercise10 {
  
	
	public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        int gcd=1;
        int lcm=1;
        
        for(int i=1; i<=n; i++) {
          
        	if(n%i==0 && m%i==0) {
                gcd=i;
            } // if
        	
        } // for
        
        lcm = n*m/gcd;
        answer[0]=gcd;
        answer[1]=lcm;
        return answer;
    } // solution
	
} // end class