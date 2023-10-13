package codingtest_level1;

class Exercise50 {
  
	
	public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number]; 
        int[] iron = new int[number]; 
        
        for(int i=1; i<=number; i++) {
            int count = 0;
           
            for(int j=1; j<=Math.sqrt(i); j++) {
            
            	if(j*j == i) {
                    count++;
                } else if(i%j == 0) {
                    count += 2;
                } // if-else
            	
            } // inner for
            arr[i-1]=count;
        } // Outter for
        
        for(int i=0; i<arr.length; i++) {
      
        	if(arr[i]<=limit) {
                iron[i]=arr[i];
            } else {
                iron[i]=power;
            } // if-else
        	
        } // for
        
        for(int i=0; i<iron.length; i++) {
            answer += iron[i];
        } //for
        
        return answer;
    } // solution
	
} // end class

