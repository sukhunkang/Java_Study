package codingtest_level0;

import java.util.*;


class Exercise169 {
   
	
	public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
       
        int j=0;
       
        for(int i=0; i<my_string.length(); i++) {
            
        	if(i!=indices[j]) {
                answer += my_string.charAt(i);
            } else {
               
            	if(j<indices.length-1) {
                    j++;
                } // if
            	
            } // if-else
        	
        } // for
        
        return answer;
    } // solution
	
} // end class