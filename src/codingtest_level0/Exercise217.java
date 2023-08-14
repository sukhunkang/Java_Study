package codingtest_level0;

import java.util.*;


class Exercise217 {
    
	
	public int solution(int[] array) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<array.length; i++) {
           
        	if(!list.contains(array[i])) {
                list.add(array[i]);
            } // if
        	
        } // for
    
        int[] arr = new int[list.size()];
       
        for(int j=0; j<list.size(); j++) {
           
        	for(int i=0; i<array.length; i++) {
                
        		if(list.get(j)==array[i]) {
                    arr[j]++;
                } // if
        		
            } // inner for
        	
        } // Outter for
        
        for(int i=0; i<arr.length; i++) {
            tmp.add(arr[i]);
        } // for
        
        int max = 0;
        int idx = 0;
       
        for(int i=0; i<tmp.size(); i++) {
           
        	if(max<tmp.get(i)) {
                max=tmp.get(i);
                idx=i;
            } // if
        	
        } // for
        
        tmp.remove(idx);
        int max2 = 0;
        int idx2 = 0;
       
        for(int i=0; i<tmp.size(); i++) {
          
        	if(max2<tmp.get(i)) {
                max2=tmp.get(i);
                idx2=i;
            } // if
        	
        } // for
        
        if(max==max2) {
            answer = -1;
            return answer;
        } // if
        
        answer = list.get(idx);
        
        return answer;
    } // solution
	
} // end class