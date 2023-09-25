package codingtest_level1;

import java.util.*;


class Exercise28 {
    
	
	public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<>(); 
        List<Integer> list2 = new ArrayList<>(); 
       
        for(int i=left; i<=right; i++) {
            int count=0;
            
            for(int j=1; j<=i; j++) {
                
            	if(i%j==0) {
                    count++;
                } // if
            	
            } // inner for
            
            if(count%2==0) {
                list1.add(i);
            } else {
                list2.add(i);
            } // if-else
            
            
        } // Outter for
        
        for(int i=0; i<list1.size(); i++) {
            answer += list1.get(i);
        } // for
        
        for(int i=0; i<list2.size(); i++) {
            answer -= list2.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class
