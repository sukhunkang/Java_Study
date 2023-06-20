package codingtest_level0;

class Exercise65 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            if(sum>n) {
                return sum;
            } else {
                continue;
            }
        }
        answer = sum;
        return answer;
    }
}