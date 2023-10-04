package codingtest_level1;

class Exercise30 {
  
	
	public boolean solution(String s) {
        boolean answer = false;
        char[] arr = new char[s.length()];
       
        for(int i=0; i<s.length(); i++) {
            arr[i]=s.charAt(i);
        } // for
        
        int count = 0;
       
        for(int i=0; i<arr.length; i++) {
           
        	if(Character.isDigit(arr[i])) {
                count++;
            } // if
        	
        } // for
        
        if(count==s.length() && (s.length()==4 || s.length()==6)) {
            answer=true;
        } // if
        
        return answer;
    } // solution
	
} // end class
