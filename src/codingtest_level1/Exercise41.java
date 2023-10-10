package codingtest_level1;

class Exercise41 {
   
	
	public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++) {
          
        	for(int j=1; j<=food[i]/2; j++) {
                answer += String.valueOf(i);
            } // inner-for
        	
        } // Outter-for
        
        answer += "0";
        
        String tmp = answer;
        
        for(int i=2; i<=tmp.length(); i++) {
            answer += tmp.charAt(tmp.length()-i); 
        } // for
        
        return answer;
    } // solution
	
} // end class
