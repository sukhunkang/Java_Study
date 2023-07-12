package codingtest_level0;

class Exercise131 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        int j=0;
        for(int i=n; i<num_list.length; i++) {
            answer[j]=num_list[i];
            j++;
        }
        int k=num_list.length-n;
        for(int i=0; i<n; i++) {
            answer[k]=num_list[i];
            k++;
        }
        return answer;
    }
}