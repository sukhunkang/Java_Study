package codingtest_level0;

class Exercise105 {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int j=0;
        
        // 약수 개수 세기
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }   
        }
        
        answer = new int[count];
        
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer[j]=i;
                j++;
            }
        }
        
        return answer;
    }
}