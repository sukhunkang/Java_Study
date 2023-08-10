package codingtest_level0;

import java.util.*;


class Exercise210 {
  
	
	public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int[] topthree = new int[3];
        
        for(int i=0; i<rank.length; i++) {
        
        	if(attendance[i]==true) {
                list.add(rank[i]);
            } // if
        	
        } // for
        
        Collections.sort(list);
        
        for(int i=0; i<rank.length; i++) {
        
        	if(rank[i]==list.get(0)) {
                topthree[0]=i;
            } else if(rank[i]==list.get(1)) {
                topthree[1]=i;
            } else if(rank[i]==list.get(2)) {
                topthree[2]=i;
            } // if-else
        	
        } // for
        
        for(int i=0; i<topthree.length; i++) {
            System.out.println(topthree[i]);
        } // for
        
       answer = 10000*topthree[0] + 100*topthree[1] + topthree[2];
        
        return answer;
    } // solution
	
} // end class
