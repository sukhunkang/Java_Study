package codingtest_level0;

class Exercise41 {
    public int[] Exercise41(int[] numbers) {
        int[] answer = {};
        answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}