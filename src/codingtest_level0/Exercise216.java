package codingtest_level0;

import java.util.*;


class Exercise216 {
   
	
	public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
          
        	if(!list.contains(arr[i]) && list.size() < k) {
                list.add(arr[i]);
            } // if
        	
        } // for
        
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        } // for
        
        if(k > list.size()) {
          
        	for(int i=list.size(); i<k; i++) {
                answer[i]=-1;
            } // for
        	
        } // if
        
        return answer;
    } // solution
	
} // end class