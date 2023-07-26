package codingtest_level0;

import java.util.*;


class Exercise173 {
   
	
	public int solution(String my_string) {
        int answer = 0;
        String str = "";
        List<String> list = new ArrayList<>();
        char[] ch = my_string.toCharArray();
        
        
        for(int i=0; i<ch.length; i++) {
           
        	if(Character.isDigit(ch[i])) {
                str += ch[i];
            } else {
                list.add(str);
                str="";
            } // if-else
        	
        } // for
        
        
        if(!(str.equals(""))) {
            list.add(str);
        } // if
        
        
        list.removeAll(Arrays.asList(""));
        
        int[] arr = new int[list.size()];
        
        
        for(int i=0; i<list.size(); i++) {
        	arr[i] = Integer.parseInt(list.get(i));
        	answer += arr[i];
        } // for
        
        
        return answer;
    } // solution
	
} // end class