package codingtest_level1;

import java.util.*;


class Exercise45 {
   
	
	public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
           
        	for(int j=i+1; j<numbers.length; j++) {
              
        		if(!list.contains(numbers[i]+numbers[j])) {
                    list.add(numbers[i]+numbers[j]);  
                } // if
        		
            } // inner-for
        	
        } // Outter-for
        
        Collections.sort(list);
        
        answer = new int[list.size()];
       
        for(int i=0; i<answer.length; i++) {
            answer[i]=list.get(i);
        } // for
         
        return answer;
    } // solution
	
} // end class
