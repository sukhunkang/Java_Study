package codingtest_level0;

import java.util.*;

class Exercise142 {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] temp = my_string.split(" ");
        List<String> newlist = new ArrayList<String>();
        
        for(int i=0; i<temp.length; i++) {
            if(!(temp[i].isEmpty())) {
                newlist.add(temp[i]);
            } 
        }
        
        answer = newlist.toArray(new String[newlist.size()]);
        
        return answer;
    }
}