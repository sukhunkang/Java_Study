package codingtest_level0;

import java.util.*;


class Exercise179 {
   
	
	public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<flag.length; i++) {
           
        	if(flag[i]) {
               
        		for(int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                } // inner-for
        		
            } else {
              
            	for(int j=0; j<arr[i]; j++) {
                    list.remove(list.size()-1);
                } // inner-for
            	
            } // if-else
        	
        } // Outter-for
        
        answer = new int[list.size()];
       
        
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class