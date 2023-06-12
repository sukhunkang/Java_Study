package codingtest_level0;

class Exercise45 {
    public int Exercise45(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i]>height) {
                answer += 1;
            }
        }
        return answer;
    }
}