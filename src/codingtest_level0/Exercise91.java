package codingtest_level0;

class Exercise91 {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        char[] array = number.toCharArray();
        for(int i=0; i<array.length; i++) {
            sum += array[i] - '0';
        }
        answer = sum%9;
        return answer;
    }
}