package codingtest_level0;

class Exercise188 {
    
	
	public String solution(String bin1, String bin2) {
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int num = num1+num2;
        
        answer = Integer.toBinaryString(num);
        
        return answer;
    } // solution
	
} // end class