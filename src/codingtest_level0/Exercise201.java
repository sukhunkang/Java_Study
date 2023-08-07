package codingtest_level0;

import java.util.*;


class Exercise201 {
  
	
	public String solution(String code) {
        String answer = "";
        List<String> ret = new ArrayList<>();
        boolean mode = false;
        
        for(int idx=0; idx<code.length(); idx++) {
          
        	if(!mode) {
                
        		if(code.charAt(idx)!='1' && idx%2 == 0) {
                    ret.add(code.substring(idx,idx+1));
                } else if(code.charAt(idx)=='1') {
                    mode = true;
                } // inner if-else
        		
            } else {
              
            	if(code.charAt(idx)!='1' && idx%2 == 1) {
                    ret.add(code.substring(idx,idx+1));
                }  else if(code.charAt(idx)=='1') {
                		mode = false;
                } // inner if-else
            	
            } // Outter if-else
        	
        } // for
        
        
        if(ret.size()==0) {
            answer="EMPTY";
        } else {
           
        	for(int i=0; i<ret.size(); i++) {
                answer += ret.get(i);
            } // for
        	
        } // if-else
        
        return answer;
    } // solution
	
	
} // end class