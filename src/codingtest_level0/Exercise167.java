package codingtest_level0;

class Exercise167 {
   
	
	public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int count=0;
        
        for(int i=0; i<intStrs.length; i++) {
           
        	if(Integer.parseInt(intStrs[i].substring(s,s+l)) > k) {
                count++;
            } // if
        	
        } // for
        
        answer = new int[count];
       
        int j=0;
        
        for(int i=0; i<intStrs.length; i++) {
           
        	if(Integer.parseInt(intStrs[i].substring(s,s+l)) > k) {
                answer[j]=Integer.parseInt(intStrs[i].substring(s,s+l));
                j++;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class