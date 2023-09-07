package codingtest_level1;

class Exercise16 {
 
	
	public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String a = String.valueOf(x);
        
        for(int i=0; i<a.length(); i++) {
            sum += Integer.parseInt(a.substring(i,i+1));
        } // for
        
        if(x%sum != 0) {
            answer = false;
        } // if
        
        return answer;
    } // solution
	
} // end class
