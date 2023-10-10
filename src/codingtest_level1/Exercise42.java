package codingtest_level1;

import java.util.*;


class Exercise42 {
   
	
	public int solution(int a, int b, int n) {
        int answer = 0;
      
        List<Integer> list = new ArrayList<>();
        int left = n;
        
        while(left>=a) {
            list.add((left/a)*b);
            left = left - (left/a)*a + (left/a)*b; 
        } // while
        
        for(int i=0; i<list.size(); i++) {
            answer += list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class
