package codingtest_level0;

class Exercise109 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count=0;
        for(int i=0; i<arr.length; i++) {
            count += arr[i];
        }
        answer = new int[count];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            for(int k=1; k<=arr[i]; k++) {
                answer[j]=arr[i];
                j++;
            }
        }
        return answer;
    }
}