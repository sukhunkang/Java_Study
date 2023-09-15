package codingtest_level1;

import java.util.*;

class Exercise22 {
    public long solution(long n) {
        long answer = 0;
        String str = n+"";
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
            list.add(str.substring(i,i+1));
        }
        Collections.sort(list,Collections.reverseOrder());

        String temp = "";
        for(int i=0; i<list.size(); i++) {
            temp += list.get(i);
        }

        answer = Long.parseLong(temp);
        return answer;
    }
}