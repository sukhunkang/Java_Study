package codingtest_level0;

import java.util.*;

class Exercise84 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer=array[array.length/2];
        return answer;
    }
}
