package codingtest_level0;

class Exercise146 {
    
	
	public int solution(int order) {
        int answer = 0;
        String num = order + "";
        
        for(int i=0; i<num.length(); i++) {
            
        	if(num.charAt(i)=='3' || num.charAt(i)=='6' || num.charAt(i)=='9') {
                answer++;
            } // if
        	
        } // for
        
        return answer;
        
    } // solution block
	
} // end class