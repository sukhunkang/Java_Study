package codingtest_level0;

import java.util.*;


class Exercise203 {
  
	
	public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            String s = String.valueOf(i);
            int count=0;
            
            for(int j=0; j<s.length(); j++) {
               
            	if(s.substring(j,j+1).equals("5") || s.substring(j,j+1).equals("0")) {
                    count++;
                } // if
            	
            } // inner for
            
            if(count==s.length()) {
                list.add(Integer.parseInt(s));
            } // if
            
        } // Outter for
        
        if(list.size()==0) {
            answer = new int[1];
            answer[0]=-1;
        } else {
            answer = new int[list.size()];
            
            for(int i=0; i<list.size(); i++) {
                answer[i]=list.get(i);
            } // for
            
        } // if-else
        
        return answer;
    } // solution
	
} // end class
