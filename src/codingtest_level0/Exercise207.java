package codingtest_level0;

import java.util.*;


class Exercise207 {
    
	
	public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        List<Integer> service = new ArrayList<>();
        
        while(coupon>=10) {
            service.add(coupon/10);
            coupon = coupon/10 + (coupon%10);
        } // while
        
        for(int i=0; i<service.size(); i++) {
            answer += service.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class