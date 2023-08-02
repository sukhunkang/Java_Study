package codingtest_level0;

import java.util.*;


class Exercise190 {
    
	
	public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        // Finding prime number
        for(int i=2; i<=n; i++) {
            int count = 0;
           
            for(int j=1; j<=i; j++) {
              
            	if(i%j==0) {
                    count++;
                } // if
            	
            } // inner-for
            
            if(count==2) {
                list.add(i);
            } // if
            
        } // Outter-for
        
        for(int i=0; i<list.size(); i++) {
         
        	if(n % list.get(i) == 0) {
                num.add(list.get(i));
            } // if
        	
        } // for
        
        answer = new int[num.size()];
       
        for(int i=0; i<num.size(); i++) {
            answer[i]=num.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class