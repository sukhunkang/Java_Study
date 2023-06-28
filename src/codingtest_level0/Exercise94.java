package codingtest_level0;

class Exercise94 {
    public String solution(String n_str) {
        String answer = "";
        char[] array = n_str.toCharArray();
        boolean run = true;
      
        for(int i=0; i<array.length; i++) {
            if(array[i]=='0') {
                answer=n_str.substring(i+1);
            } else {
                answer=n_str.substring(i);
                break;
                } 
            }
        return answer;
    }
}