package codingtest_level0;

import java.util.*;


class Exercise192 {
   
	
	public String[] solution(String myStr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        String str="";
        
        for(int i=0; i<myStr.length(); i++) {
           
        	if(myStr.charAt(i)!='a' && myStr.charAt(i)!='b' && myStr.charAt(i)!='c') {
                str += myStr.charAt(i);
            } else {
                list.add(str);
                str="";
            } // if-else
        	
        } // for
        
        if(!str.equals("")) {
            list.add(str);
        } // if
        
        list.removeAll(Arrays.asList(""));
        
        if(list.size()==0) {
            answer = new String[1];
            answer[0]="EMPTY";
            return answer;
        } else {
            answer = new String[list.size()];
           
            for(int i=0; i<list.size(); i++) {
                answer[i]=list.get(i);
            } // for
            
        } // if-else

        return answer;
    } // solution
	
} // end class