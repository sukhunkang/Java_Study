package codingtest_level0;

class Exercise104 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = arr1.length;
        int num2 = arr2.length;
        
        int sum1 = 0; int sum2 = 0;
        
        for(int i=0; i<num1; i++) {
            sum1 += arr1[i];
        }
        
        for(int i=0; i<num2; i++) {
            sum2 += arr2[i];
        }
        
        if(num1>num2) {
            answer=1;
        } else if(num1<num2) {
            answer=-1;
        } else {
            if(sum1>sum2) {
                answer=1;
            } else if(sum1<sum2) {
                answer=-1;
            } else{
                answer=0;
            }
        }
        return answer;
    }
}