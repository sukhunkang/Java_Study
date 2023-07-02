package codingtest_level0;

class Exercise103 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.substring(i).equals(is_suffix)==true) {
                answer=1;
            }
        }
        return answer;
    }
}