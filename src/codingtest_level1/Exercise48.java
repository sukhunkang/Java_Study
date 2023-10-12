package codingtest_level1;

import java.util.*;


class Exercise48 {
   
	
	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++) {
            list.add(strings[i].charAt(n) + "" + strings[i]);
        } // for
        
        Collections.sort(list);
        
        answer = new String[strings.length];
       
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i).substring(1);
        } // for
        
        return answer;
    } // solution
	
} // end class
