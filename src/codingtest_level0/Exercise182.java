package codingtest_level0;

class Exercise182 {
    
	
	public int solution(String my_string) {
        int answer = 0;
        String[] calc = my_string.split(" ");
        answer = Integer.parseInt(calc[0]);
        
        
        for(int i=1; i<calc.length-1; i++) {
           
        	if(calc[i].equals("+")) {
                answer += Integer.parseInt(calc[i+1]);
            } else if(calc[i].equals("-")) {
                answer -= Integer.parseInt(calc[i+1]);
            } // if-else
        	
        } // for
        
        return answer;
        
    } // solution
	
} // end class
