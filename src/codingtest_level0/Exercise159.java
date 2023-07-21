package codingtest_level0;

class Exercise159 {
   
	
	public String[] solution(String my_str, int n) {
        String[] answer = {};
        int a = my_str.length();
        int r; // r: answer의 원소 개수
        
        
        if(a%n == 0) {
            r= a/n;
        } else {
            r= a/n + 1;
        } // if-else
        
        
        answer = new String[r];
        
        
        for(int i=0; i<r; i++) {
           
        	if(n*(i+1) < a) {
                answer[i]=my_str.substring(n*i,n*(i+1));
            } else {
                answer[i]=my_str.substring(n*i);
            } // if-else
        	
        } // for

        return answer;
        
    } // main
	
} // end class