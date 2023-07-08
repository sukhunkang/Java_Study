package codingtest_level0;

class Exercise120 {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(my_string.substring(i,i+1));
            }
        }
        return answer;
    }
}