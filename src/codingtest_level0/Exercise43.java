package codingtest_level0;

class Exercise43 {
    public int[] Exercise43(int start, int end) {
        int[] answer = {};
        int length = end - start + 1;
        answer = new int[length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}