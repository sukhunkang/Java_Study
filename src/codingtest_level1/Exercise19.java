package codingtest_level1;

class Exercise19 {
  
	
	public String solution(String phone_number) {
        String answer = "";
    
        for(int i=0; i<=phone_number.length()-5; i++) {
            answer += "*";
        } // for
        
        for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
            answer += phone_number.substring(i,i+1);
        } // for
        
        return answer;
    } // solution
	
} // end class
