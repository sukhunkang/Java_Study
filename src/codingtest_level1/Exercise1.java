package codingtest_level1;

class Exercise1 {
    
	
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
      
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        } // for
        
        answer = (double) sum / arr.length;
        return answer;
    } // solution
	
} // end class