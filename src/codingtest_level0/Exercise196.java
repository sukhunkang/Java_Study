package codingtest_level0;

import java.math.*;


class Exercise196 {
    
	
	public String solution(String a, String b) {
        String answer = "";
        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);
        BigInteger e = c.add(d);
        answer = String.valueOf(e);
        return answer;
    } // solution
	
} // end class