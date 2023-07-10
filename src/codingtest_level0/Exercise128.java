package codingtest_level0;

class Exercise128 {
    public String solution(String myString) {
        String answer = "";
        char[] array = myString.toCharArray();
        
        for(int i=0; i<array.length; i++) {
            if(array[i]<'l') {
                array[i]='l';
            }
        }
        
        for(int i=0; i<array.length; i++) {
            answer += array[i];
        }
        return answer;
    }
}