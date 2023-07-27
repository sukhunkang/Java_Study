package codingtest_level0;

class Exercise180 {
   
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        int a = arr.length;
        int b = 0;
        
        
        while(a > Math.pow(2,b)) {
            b++;
        } // while
        
        a = (int) Math.pow(2,b);
        
        answer = new int[a];
        
        
        for(int i=0; i<arr.length; i++) {
            answer[i]=arr[i];
        } // for

        return answer;
    } // solution
	
} // end class