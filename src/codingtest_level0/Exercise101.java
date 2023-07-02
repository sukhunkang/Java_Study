package codingtest_level0;

class Exercise101 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = "";
        char[] array = myString.toCharArray();
        
        for(int i=0; i<array.length; i++) {
            if(array[i]=='A') {
                array[i]='B';
            } else if(array[i]=='B') {
                array[i]='A';
            }
            newString += array[i];
        }
        
        answer = newString.contains(pat) ? 1 : 0;
        return answer;
    }
}