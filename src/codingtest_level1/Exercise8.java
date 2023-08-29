package codingtest_level1;

class Exercise8 {
    
	
	public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        for(int i=1; i<=count; i++) {
            sum += price*i;
        } // for
        
        if(money-sum<0) {
            answer=sum-money;
        } else {
            answer=0;
        } // if-else
        
        return answer;
    } // solution
	
} // end class