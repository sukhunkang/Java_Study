package codingtest_level0;

class Exercise149 {
    
	
	public int solution(String binomial) {
        int answer = 0;
        String cal[] = binomial.split(" ");
        int a = Integer.parseInt(cal[0]);
        int b = Integer.parseInt(cal[2]);
        
        if(cal[1].equals("+")) {
            answer = a+b;
        } else if(cal[1].equals("-")) {
            answer = a-b;
        } else {
            answer = a*b;
        } // if-else
        
        return answer;
        
    } // solution
    
} // end class
