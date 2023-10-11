package codingtest_level1;

class Exercise46 {
 
	
	public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            int idx=0;
            int count=0;
          
            for(int j=i; j>=0; j--) {
              
            	if(s.charAt(i)==s.charAt(j)) {
                    idx=j;
                    count++;
                   
                    if(count>=2) {
                        break;
                    } // inner-if
                    
                } // Outter-if
            	
            } // inner-for
            
            if(idx==i) {
                answer[i]=-1;
            } else {
                answer[i]=i-idx;
            } // if-else
            
        } // Outter-for
        
        return answer;
    } // solution
	
} // end class
