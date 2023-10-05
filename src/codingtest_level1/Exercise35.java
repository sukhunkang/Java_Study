package codingtest_level1;

import java.util.*;


class Exercise35 {

	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        } // for
        
        return answer;
    } // solution
	
} // end class
