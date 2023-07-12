package codingtest_level0;

class Exercise134 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++) {
            for(int j=parts[i][0]; j<=parts[i][1]; j++) {
                answer += my_strings[i].substring(j,j+1);
            }
        }
        return answer;
    }
}