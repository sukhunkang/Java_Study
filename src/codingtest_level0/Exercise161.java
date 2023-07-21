package codingtest_level0;

import java.util.*;

class Exercise161 {
    
	
	public int[] solution(int[] emergency) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        for(int i : emergency) {
            list.add(i);
        } // for
        
        
        Collections.sort(list, Collections.reverseOrder());
        
        answer = new int[emergency.length];
        
        
        for(int i=0; i<answer.length; i++) {
            answer[i]=list.indexOf(emergency[i])+1;
        } // for
        
        
        return answer;
        
    } // solution
	
} // end class