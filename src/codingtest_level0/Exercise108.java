package codingtest_level0;

class Exercise108 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int count = 0;
        int j=0;
        
        // 안 끝낸 일 개수 세기
        for(int i=0; i<finished.length; i++) {
            if(finished[i]==false) {
                count++;
            }
        }
        
        answer = new String[count];
        
        for(int i=0; i<finished.length; i++) {
            if(finished[i]==false) {
                answer[j]=todo_list[i];
                j++;
            }
        }
        
        return answer;
    }
}