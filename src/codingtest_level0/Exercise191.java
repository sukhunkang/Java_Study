package codingtest_level0;

import java.util.*;


class Exercise191 {
  
	
	public int solution(int a, int b) {
        int answer = 1;
        int gcd=1;
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=a; i++) {
           
        	if(a%i==0 && b%i==0) {
                gcd = i;
            } // if
        	
        } // for
        
        int c = a/gcd;
        int d = b/gcd;
        
        for(int i=1; i<=d; i++) {
            int count=0;
           
            for(int j=1; j<=i; j++) {
              
            	if(i%j==0) {
                    count++;
                } // if
            	
            } // inner-for
            
            if(count==2 && d%i==0) {
                list.add(i);
            } // if
            
        } // Outter-for
        
        for(int i=0; i<list.size(); i++) {
           
        	if(list.get(i)!=2 && list.get(i)!=5) {
                answer=2;
                break;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class