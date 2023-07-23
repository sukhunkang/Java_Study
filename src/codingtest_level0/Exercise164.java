package codingtest_level0;

class Exercise164 {
    
	
	public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0,s);
        String c = my_string.substring(e+1);
        String b = "";
        
        
        for(int i=e; i>=s; i--) {
            b += my_string.substring(i,i+1);
        } // for
        
        
        answer=a+b+c;
        return answer;
        
    } // solution
	
} // end class