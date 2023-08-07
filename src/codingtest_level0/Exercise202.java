package codingtest_level0;

import java.util.*;


class Exercise202 {
    
	
	public String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<str_list.length; i++) {
           
        	if(str_list[i].equals("l")) {
                
        		for(int j=0; j<i; j++) {
                    list.add(str_list[j]);
                } // inner for
        		
                break;
                
            } else if(str_list[i].equals("r")) {
                
            	for(int j=i+1; j<str_list.length; j++) {
                    list.add(str_list[j]);
                } // inner for
            	
                break;
            } // if-else
        	
        } // Outter for
        
        answer = new String[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i]=list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class