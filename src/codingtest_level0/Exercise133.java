package codingtest_level0;

class Exercise133 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if(direction.equals("right")) {
            answer[0]=numbers[numbers.length-1];
            int j=1;
            for(int i=0; i<numbers.length-1; i++) {
                answer[j]=numbers[i];
                j++;
            }
        } else {
            answer[answer.length-1]=numbers[0];
            int k=0;
            for(int i=1; i<numbers.length; i++) {
                answer[k]=numbers[i];
                k++;
            }
        }
        return answer;
    }
}