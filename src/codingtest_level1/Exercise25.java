package codingtest_level1;

import java.util.*;


class Exercise25 {
    
	
	public long[] solution(long x, long n) {
        long[] answer = {};
        List<Long> list = new ArrayList<>();
        
        if(x>0) {
          
        	for(long i=x; i<=x*n; i=i+x) {
        		list.add(i);
            } // for
        	
        } else if (x<0) {
            
        	for(long i=x; i>=x*n; i=i+x) {
        		list.add(i);
            } // for
        	
        } else {
            for(long i=1; i<=n; i++) {
                list.add(0L);
            } // for
            
        } // if-else
        
        answer = new long[list.size()];
        int i=0;
       
        for(Long l : list) {
            answer[i++] = l;
        } // for
      
        return answer;
    } // solution
	
} // end class
