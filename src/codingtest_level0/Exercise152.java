package codingtest_level0;

class Exercise152 {


	public String solution(String my_string, int m, int c) {
        String answer = "";
        int l1 = my_string.length();
        int l2 = l1/m;
        
        for(int i=0; i<l2; i++) {
            answer += my_string.charAt((c-1)+m*i);
        } // for
        
        return answer;
        
    } // solution
	
} // end class