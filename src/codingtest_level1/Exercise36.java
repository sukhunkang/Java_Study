package codingtest_level1;

import java.util.*;


class Exercise36 {

	
	public int solution(String t, String p) {
        int answer = 0;
    
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<=t.length()-p.length(); i++) {
            list.add(t.substring(i,i+p.length()));
        } // for
        
        for(int i=0; i<list.size(); i++) {
            long a = Long.parseLong(list.get(i));
            long b = Long.parseLong(p);
           
            if(a<=b) {
                answer++;
            } // if
            
        } // for
        
        return answer;
    } // solution
	
} // end class