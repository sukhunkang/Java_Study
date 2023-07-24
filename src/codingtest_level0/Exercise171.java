package codingtest_level0;

import java.util.*;


class Exercise171 {


	public int solution(int[] array, int n) {
        int answer = 0;
        int min=1000;
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<array.length; i++) {
          
        	if( (int) Math.abs(array[i]-n) < min ) {
                min = (int) Math.abs(array[i]-n);
            } // if
        	
        } // for
        
        
        for(int i=0; i<array.length; i++) {
           
        	if( (int) Math.abs(array[i]-n) == min ) {
                list.add(array[i]);
            } // if
        	
        } // for
        
        
        Collections.sort(list);
        answer=list.get(0);
        return answer;
    } // solution
	
} // end class