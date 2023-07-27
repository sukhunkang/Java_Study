package codingtest_level0;

import java.util.*;


class Exercise177 {
    
	
	public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        
        for(int i=0; i<s.length(); i++) {
            int count = 1;
           
            for(int j=0; j<s.length(); j++) {
               
            	if(s.charAt(i)==s.charAt(j) && i!=j) {
                    count++;
                } // if
            	
            } // inner-for
            
            if(count==1) {
                list.add(s.substring(i,i+1));
            } // if
            
        } // Outter-for
        
        Collections.sort(list);
         
        for(int i=0; i<list.size(); i++) {
            answer += list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class