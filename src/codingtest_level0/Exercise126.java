package codingtest_level0;

import java.util.*;
class Exercise126 {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count=0;
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                count++;
            }
        }
        answer = new int[count];
        
        int j=0;
        for(int i=0; i<my_string.length(); i++) {
           if(Character.isDigit(my_string.charAt(i))) {
                answer[j]=Integer.parseInt(my_string.substring(i,i+1));
               j++;
            } 
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}