package codingtest_level1;

import java.util.*;

class Exercise14 {
 
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
      
        for(int i=0; i<arr.length; i++) {
           
        	if(arr[i]%divisor==0) {
                count++;
            } // if
        	
        } // for
        
        if(count==0) {
            answer = new int[1];
            answer[0]=-1;
        } else {
            answer = new int[count];
            int j=0;
          
            for(int i=0; i<arr.length; i++) {
               
            	if(arr[i]%divisor==0) {
                    answer[j]=arr[i];
                    j++;
                } // if
                
            } // for
            
            Arrays.sort(answer);
        } // if-else
        
        return answer;
    } // solution
	
} // end class
