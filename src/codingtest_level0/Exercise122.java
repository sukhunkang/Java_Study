package codingtest_level0;

import java.util.*;
class Exercise122 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = new int[num_list.length-5];
        
        int j=0;
        for(int i=5; i<num_list.length; i++) {
            answer[j]=num_list[i];
            j++;
        }
        return answer;
    }
}