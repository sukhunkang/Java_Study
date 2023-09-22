package codingtest_level1;

import java.util.*;


class Exercise27 {
 
	
	public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<=9; i++) {
            list.add(i);
        } // for
        
        for(int i=0; i<numbers.length; i++) {
         
        	for(int j=0; j<list.size(); j++) {
            
        		if(numbers[i]==list.get(j)) {
                    list.remove(j);
                } // if
        		
            } // inner-for
        	
        } // Outter-for

        for(int i=0; i<list.size(); i++) {
            answer += list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class
