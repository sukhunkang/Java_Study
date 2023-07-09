package codingtest_level0;

class Exercise127 {
    public String solution(String myString) {
        String answer = "";
        myString=myString.toLowerCase();
        char[] array = myString.toCharArray();
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i)=='a') {
                array[i]='A';
            }
        }
        for(int i=0; i<array.length; i++) {
            answer += array[i];
        }
        return answer;
    }
}