package codingtest_level1;

import java.util.*;


class Exercise26 {
    
	
	public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
            list.add(s.substring(i,i+1));
        } // for
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++) {
            answer += list.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class