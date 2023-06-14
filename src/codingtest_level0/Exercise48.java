package codingtest_level0;

class Exercise48 {
    public int Exercise48(int num1, int num2) {
        int answer = 0;
        double temp = ((double) num1 / num2)*1000;
        answer = (int) Math.floor(temp);
        return answer;
    }
}