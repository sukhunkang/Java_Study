package codingtest_level1;

class Exercise20 {
    
	
	public int[] solution(long n) {
        int[] answer = {};
        String s = n + "";
        answer = new int[s.length()];
        int j=0;
      
        for(int i=s.length()-1; i>=0; i--) {
            answer[j]=Integer.parseInt(s.substring(i,i+1));
            j++;
        } // for
        
        return answer;
    } // solution
	
} // end class
