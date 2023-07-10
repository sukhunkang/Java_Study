package codingtest_level0;

class Exercise129 {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int count=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i]==delete_list[j]) {
                    arr[i]=0;
                    count++;
                }
            }
        }
        answer = new int[arr.length-count];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                answer[j]=arr[i];
                j++;
            }
        }
        return answer;
    }
}