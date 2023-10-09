package codingtest_level1;

class Exercise37 {
  
	
	public int solution(String s) {
        int answer = 0;
      
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
            s = s.replaceAll(word[i], String.valueOf(i));
        } // for
        
        answer = Integer.parseInt(s);
        
        return answer;
    }  // solution
	
} // end class
