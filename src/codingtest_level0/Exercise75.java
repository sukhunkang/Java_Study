package codingtest_level0;

class Exercise75 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1=0;
        int sum2=0;
        if(num_list.length/2 == 0) {
           for(int i=0; i<num_list.length/2; i++) {
                sum1 += num_list[2*i];
                sum2 += num_list[2*i+1];
            } 
        } else {
            for(int i=0; i<num_list.length/2; i++) {
                sum2 += num_list[2*i+1];
            }
            for(int i=0; i<(num_list.length+1)/2; i++) {
                sum1 += num_list[2*i];
            }
        }
        
        answer = (sum1>=sum2) ? sum1 : sum2;
        return answer;
    }
}