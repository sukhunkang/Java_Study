package codingtest_level0;

class Exercise102 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.substring(0,i).equals(is_prefix) == true) {
                answer = 1;
            }
        }
        return answer;
    }
}