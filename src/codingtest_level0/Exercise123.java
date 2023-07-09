package codingtest_level0;

import java.util.*;
class Exercise123 {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = new String[my_string.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i]=my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}