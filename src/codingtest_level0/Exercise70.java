package codingtest_level0;

class Exercise70 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int k = num_list.length-n+1;
        answer = new int[k];
        for(int i=0; i<k; i++) {
            answer[i]=num_list[n-1+i];
        }
        return answer;
    }
}