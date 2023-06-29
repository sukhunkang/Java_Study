package codingtest_level0;

class Exercise96 {
    public String solution(String my_string, String alp) {
        String answer = "";
        String cap = alp.toUpperCase();
        answer = my_string.replace(alp,cap);
        return answer;
    }
}