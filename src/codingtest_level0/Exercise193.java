package codingtest_level0;

class Exercise193 {
   
	
	public long solution(String numbers) {
        long answer = 0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
       
        for(int i=0; i<=9; i++) {
            numbers = numbers.replaceAll(arr[i],String.valueOf(i));
        } // for
        
        answer = Long.parseLong(numbers);
        return answer;
    } // solution
	
} // end class