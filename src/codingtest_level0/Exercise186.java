package codingtest_level0;

class Exercise186 {
   
	
	public int solution(int[] arr) {
        int answer = 0;
        boolean flag=true;
        
        while(flag) {
            int count=0;
            
            for(int i=0; i<arr.length; i++) {
               
            	if(arr[i]>=50 && arr[i]%2==0) {
                    arr[i]=arr[i]/2;
                } else if(arr[i]<50 && arr[i]%2==1) {
                    arr[i]=arr[i]*2+1;
                } else {
                    count++;
                } // if-else
            	
            } // for
            
            answer++;
            
            if(count==arr.length) {
                flag=false;
            } // if
            
        } // while
        
        answer--;
        return answer;
    } // solution
	
} // end class