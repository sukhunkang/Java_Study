package codingtest_level0;

class Exercise26 {
    public int[] Exercise26(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length+1];
        for(int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            int a = num_list[num_list.length - 1] - num_list[num_list.length - 2];
            answer[answer.length-1] = a;
        } else {
            int b = num_list[num_list.length - 1] * 2;
            answer[answer.length-1] = b;
        }
        return answer;
    }
}