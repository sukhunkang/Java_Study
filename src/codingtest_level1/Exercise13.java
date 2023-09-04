package codingtest_level1;

class Exercise13 {
    
	
	public String solution(String[] seoul) {
        String answer = "";
        int k=0;
    
        for(int i=0; i<seoul.length; i++) {
        
        	if(seoul[i].contains("Kim")){
                k=i;
                break;
            } // if
        	
        } // for
        
        answer = "김서방은 " + k + "에 있다";
        return answer;
    } // solution
	
} // end class