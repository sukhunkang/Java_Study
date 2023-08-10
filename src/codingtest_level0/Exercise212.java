package codingtest_level0;

import java.util.*;


class Exercise212 {
  
	
	public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<query.length; i++) {
            
        	if(i%2==0) {
                
        		for(int j=0; j<=query[i]; j++) {
                    list.add(arr[j]);
                } // inner for
        		
            } else {
               
            	for(int j=query[i]; j<arr.length; j++) {
                    list.add(arr[j]);
                } // inner for
            	
            } // if-else
            
            arr = new int[list.size()];
           
            for(int j=0; j<list.size(); j++) {
                arr[j]=list.get(j);
            } // inner for
            
            if(i==query.length-1) {
                break;
            } // if
            
            list.clear();
        } // Outter for
        
        answer = new int[list.size()];
       
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class
