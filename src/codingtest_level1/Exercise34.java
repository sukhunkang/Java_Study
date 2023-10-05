package codingtest_level1;

class Exercise34 {
    
	
	public int solution(int n) {
        int answer = 0;
        String n_3 = Integer.toString(n,3);
        String n_reverse = "";
        
        for(int i=0; i<n_3.length(); i++) {
            n_reverse += n_3.charAt(n_3.length()-1-i);
        } // for
        
        answer = Integer.parseInt(n_reverse, 3);
        return answer;
    } // solution
	
} // end class