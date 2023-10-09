package codingtest_level1;

import java.util.*;


class Exercise39 {
  
	
	public int[] solution(int k, int[] score) {
        int[] answer = {};
        answer = new int[score.length];
       
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list,Collections.reverseOrder());
          
            if(list.size()<k) {
                answer[i]=list.get(list.size()-1);
            } else {
                answer[i]=list.get(k-1);
            } // if-else
            
        } // for
        
        return answer;
    } // solution
	
} // end class
