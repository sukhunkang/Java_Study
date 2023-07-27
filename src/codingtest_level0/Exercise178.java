package codingtest_level0;

import java.util.*;


class Exercise178 {
    
	
	public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        
        switch(n) {
          
        	case 1: 
                
        		for(int i=0; i<=b; i++) {
                    list.add(num_list[i]);
                } // for
        		
                break;
                
            case 2:
               
            	for(int i=a; i<num_list.length; i++) {
                    list.add(num_list[i]);
                } // for
            	
                break;
                
            case 3:
              
            	for(int i=a; i<=b; i++) {
                    list.add(num_list[i]);
                } // for
            	
                break;
                
            case 4:
               
            	for(int i=a; i<=b; i=i+c) {
                    list.add(num_list[i]);
                } // for
            	
                break;
        } // switch
        
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        } // for
        
        return answer;
        
    } // solution
	
} // end class