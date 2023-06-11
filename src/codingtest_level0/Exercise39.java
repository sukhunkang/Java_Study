package codingtest_level0;

class Exercise39 {
    public double Exercise39(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int i : numbers) {
            sum += i;   
        }
        answer = (double) sum / numbers.length;
        return answer;
    }
}