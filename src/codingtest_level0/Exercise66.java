package codingtest_level0;

class Exercise66 {
    public int solution(String num_str) {
        int answer = 0;
        int array[] = new int[num_str.length()];
        for(int i=0; i<num_str.length(); i++) {
            array[i] = Integer.parseInt(num_str.substring(i,i+1));
            answer += array[i];
        }
        return answer;
    }
}