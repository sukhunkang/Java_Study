package codingtest_level0;

class Exercise139 {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int length1 = intervals[0][1]-intervals[0][0]+1;
        int length2 = intervals[1][1]-intervals[1][0]+1;
        int length = length1 + length2;
        answer = new int[length];
        
        for(int i=0; i<length1; i++) {
            answer[i]=arr[intervals[0][0]+i];
        }
        
        int j=0;
        for(int i=length1; i<length; i++) {
            answer[i]=arr[intervals[1][0]+j];
            j++;
        }
        
        return answer;
    }
}