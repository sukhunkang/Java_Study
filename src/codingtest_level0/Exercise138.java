package codingtest_level0;

class Exercise138 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int length = num_list.length/n;
        answer = new int[length][n];
        
        int k=0;
        for(int i=0; i<length; i++) {
            for(int j=0; j<n; j++) {
                answer[i][j]=num_list[k];
                k++;
            }
        }
        return answer;
    }
}