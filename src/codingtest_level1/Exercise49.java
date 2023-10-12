package codingtest_level1;

class Exercise49 {
  
	
	public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        
        for(int i=2; i<=n; i++) {
            arr[i]=i;
        } // for
        
        
        //에라토스테네스의 채 이용하기
        for(int i=2; i<= Math.sqrt(n); i++) {
           
        	if(arr[i] == 0) {
                continue;
            } // if
        	
            for(int j=i*2; j<=n; j=j+i) {
            
            	if(arr[j]%i == 0) {
                    arr[j]=0;
                } // if
            	
            } // inner-for
            
        } // Outter-for
        
        for(int i=2; i<=n; i++) {
         
        	if(arr[i] != 0) {
                answer++;
            } // if
        	
        } // for
        
        return answer;
    } //solution
	
} // end class
