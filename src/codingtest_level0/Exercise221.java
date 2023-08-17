package codingtest_level0;

import java.util.*;


class Exercise221 {
   
	
	public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k];
       
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        String tmp = "";
        
        for(String p : picture) {
           
        	for(int i=0; i<p.length(); i++) {
               
        		for(int j=0; j<k; j++) {
                    tmp += p.substring(i,i+1);
                } // First for
        		
            } // Second for
        	
            list.add(tmp);
            tmp = "";
        } // Third for
        
        for(int i=0; i<list.size(); i++) {
           
        	for(int j=0; j<k; j++) {
                list2.add(list.get(i));
            } // inner for
        	
        } // Outter for
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list2.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class