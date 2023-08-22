package codingtest_level1;

import java.util.*;


public class Exercise3 {
  
	
	public int solution(int n) {
        int answer = 0;
        String m = n + "";
       
        for(int i=0; i<m.length(); i++) {
            answer += Integer.parseInt(m.substring(i,i+1));
        } // for
        
        return answer;
    } // solution
	
} // end class