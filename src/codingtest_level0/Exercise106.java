package codingtest_level0;

class Exercise106 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int length = num2-num1+1;
        answer = new int[length];
        int j=0;
        
        for(int i=num1; i<=num2; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}