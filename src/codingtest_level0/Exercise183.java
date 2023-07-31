package codingtest_level0;

class Exercise183 {
   
	
	public String solution(String myString, String pat) {
        String answer = "";
        int count = 0;
        
        
        if(myString.substring(myString.length()-1,myString.length()).contains(pat)) {
            answer = myString.substring(0);
            return answer;
        } // if
        
        
        for(int i=myString.length()-1; i>=0; i--){
          
        	if(myString.substring(i,myString.length()-1).contains(pat)){
                count=i;
                break;
            } // if
        	
        } // for
        
        answer = myString.substring(0,count+pat.length());
        return answer;
        
    } // solution
	
} // end class