package codingtest_level0;

class Exercise69 {
    public int[] solution(int start, int end) {
        int[] answer = {};
        int length = start-end+1;
        answer = new int[length];
        for(int i=0; i<length; i++) {
            answer[i]=start-i;
        }
        return answer;
    }
}