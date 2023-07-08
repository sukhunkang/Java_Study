package codingtest_level0;

import java.util.*;
class Exercise121 {
    public int solution(String before, String after) {
        int answer = 0;
        answer=1;
        char[] array1 = before.toCharArray();
        char[] array2 = after.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for(int i=0; i<array1.length; i++) {
            if(array1[i] != array2[i]) {
                answer=0;
            }
        }
        return answer;
    }
}