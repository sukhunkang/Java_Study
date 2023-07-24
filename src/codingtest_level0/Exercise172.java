package codingtest_level0;

class Exercise172 {
   
	
	public int solution(int i, int j, int k) {
        int answer = 0;
        String k_str = String.valueOf(k);
        
        
        for(int n=i; n<=j; n++) {
            String m = String.valueOf(n);
            
            for(int l=0; l<m.length(); l++) {
               
            	if(m.substring(l,l+1).equals(k_str)) {
                    answer++;
                } // if
            	
            } // inner-for
            
        } // Outter-for
        
        return answer;
        
    } // solution
	
} // end class