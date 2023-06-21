package codingtest_level0;

class Exercise71 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int k=0;
        for(int i=0; i<num_list.length; i++) {
            if(n*i<num_list.length) {
                k += 1;
            }
        }
        answer = new int[k];
        for(int i=0; i<k; i++) {
            answer[i] = num_list[0+n*i];
        }
        return answer;
    }
}