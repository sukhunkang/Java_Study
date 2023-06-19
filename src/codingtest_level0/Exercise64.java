package codingtest_level0;

class Exercise64 {
    public String solution(String my_string, int n) {
        String answer = "";
        int m = my_string.length();
        answer = my_string.substring(m-n);
        return answer;
    }
}