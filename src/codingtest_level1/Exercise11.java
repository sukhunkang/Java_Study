package codingtest_level1;

import java.util.*;

class Exercise11 {
   
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 1000000000;
      
        for(int i=0; i<arr.length; i++) {
           
        	if(arr[i]<min) {
                min=arr[i];
            } // if
        	
        } // for
        
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        if(arr.length>1) {
          
        	for(int i=0; i<arr.length; i++) {
              
        		if(arr[i]!=min) {
                    list.add(arr[i]);
                } // inner if
        		
        	} // for
        	
        } else {
            list.add(-1);
        } // if-else
        
        answer = new int[list.size()];
       
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i).intValue();
        } // for
        
        return answer;
    } // solution
	
} // end class
