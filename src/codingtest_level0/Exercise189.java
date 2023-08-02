package codingtest_level0;

class Exercise189 {
   
	
	public int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++) {
           
        	if(!arr[i].equals("Z")) {
                int num = Integer.parseInt(arr[i]);
                answer += num;
                temp = num;
            } else {
                answer -= temp; 
            } // if-else
        	
        } // for
        
        return answer;
    } // solution
	
} // end class