package codingtest_level0;

class Exercise181 {
   
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        int n1=0;
        int n2=0;
        boolean flag = false;
        
        
        for(int i=0; i<arr.length; i++) {
           
        	if(arr[i]==2) {
                flag=true;
                break;
            } // if
        	
        } // for
        
        
        if(!flag) {
            answer = new int[1];
            answer[0]=-1;
            return answer;
        } // if
        
        
        for(int i=0; i<arr.length; i++) {
           
        	if(arr[i]==2) {
                n1=i;
                break;
            } // if
        	
        } // for
        
        
        for(int i=arr.length-1; i>=0; i--) {
           
        	if(arr[i]==2) {
                n2=i;
                break;
            } // if
        	
        } // for
        
        answer = new int[n2-n1+1];
        
        int j=0;
        
        for(int i=n1; i<=n2; i++) {
            answer[j]=arr[i];
            j++;
        } // for
        
        return answer;
    } // solution
	
} // end class