package codingtest_level0;

import java.util.*;


class Exercise166 {
   
	
	public String[] solution(String myString) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        String str = "";
       
        
        for(int i=0; i<myString.length(); i++) {
         
        	if(myString.charAt(i)!='x'){
                str += myString.charAt(i);
            } else {
                list.add(str);
                str = "";
            } // if-else
        	
        } // for
              
        
        if(!(str.equals(""))) {
            list.add(str);
        } // if
        
        Collections.sort(list);
        list.removeAll(Arrays.asList(""));
      
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        } // for
        
        return answer;
        
    } // solution
	
} // end class