package codingtest_level0;

import java.util.*;


class Exercise200 {


	public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
           
        	if(stk.size()==0) {
                stk.add(arr[i]);
            } else if(stk.size()!=0 && stk.get(stk.size()-1)==arr[i]) {
                stk.remove(stk.size()-1);
            } else if(stk.size()!=0 && stk.get(stk.size()-1)!=arr[i]) {
                stk.add(arr[i]);
            } // if-else
        	
        } // for
        
        answer = new int[stk.size()];
        
        if(answer.length==0) {
            answer = new int[1];
            answer[0]=-1;
        } else {
            
        	for(int i=0; i<answer.length; i++) {
                answer[i]=stk.get(i);
            } // for
        	
        } // if-else
        
        return answer;
    } // solution
	
} // end class