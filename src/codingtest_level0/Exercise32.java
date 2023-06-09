package codingtest_level0;

class Exercise32 {
    public int Exercise32(int[] num_list, int n) {
        int answer = 0;
        int check = 0;
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] == n) {
                check = 1;
            } 
        }
        answer = check;
        return answer;
    }
}