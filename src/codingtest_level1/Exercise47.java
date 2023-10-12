package codingtest_level1;

import java.util.*;


class Exercise47 {
   
	
	public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String str = "";
        
        for(int i=0; i<s.length(); i++) {
           
        	if(!s.substring(i,i+1).equals(" ")) {
                str += s.charAt(i);
            } else {
                list.add(str);
                str = "";
            } // if-else
        	
        } // for
        
        if(!str.equals(" ")) {
            list.add(str);
        } // if
        
        for(int i=0; i<list.size(); i++) {
            str = "";
            
            for(int j=0; j<list.get(i).length(); j++) {
               
            	if(j%2==0) {
                    str += list.get(i).substring(j,j+1).toUpperCase();
                } else {
                    str += list.get(i).substring(j,j+1).toLowerCase();
                } // if-else
            	
            } // inner-for
            
            list2.add(str);
        } // Outter-for
        
        for(int i=0; i<list2.size()-1; i++) {
            answer += list2.get(i) + " ";
        } // for
        
        answer += list2.get(list2.size()-1);
        
        return answer;
    } // solution
	
} // end class
