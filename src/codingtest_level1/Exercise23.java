package codingtest_level1;

class Exercise23 {
    
	
	boolean solution(String s) {
        boolean answer = true;
        String a = s.toLowerCase();
        int num1 = 0; 
        int num2 = 0;
        
        for(int i=0; i<a.length(); i++) {
            
        	if(a.charAt(i)=='p') {
                num1++;
            } // if
        	
        } // for
        
        for(int i=0; i<a.length(); i++) {
            
        	if(a.charAt(i)=='y') {
                num2++;
            } // if
        	
        } // for
        
        if(num1==num2) {
            answer = true;
        } else {
            answer = false;
        } // if-else
        
        return answer;
    } // solution
	
} // end class
