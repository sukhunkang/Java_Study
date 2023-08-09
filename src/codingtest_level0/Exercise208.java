package codingtest_level0;

class Exercise208 {
   
	
	public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int x_front = 0;
        int constant = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<arr.length; i++) {
           
        	if(!arr[i].contains("x") && !arr[i].contains("+")) {
                constant += Integer.parseInt(arr[i]);
                count1++;
            } else if(!arr[i].contains("+") && arr[i].contains("x")) {
                count2++;
               
                if(arr[i].length()>1) {
                    int a = Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
                    x_front += a;
                } else {
                    x_front++;
                } // inner if-else
                
            } // Outter if-else
        	
        } // for
        
        if(count1>0 && count2==0) {
            answer = constant + "";
        } else if(count1>0 && count2>0) {
           
        	if(x_front > 1) {
                answer = x_front + "x + " + constant;
            } else {
                answer = "x + " + constant;
            } // inner if-else
            
        } else if(count1==0 && count2>0) {
           
        	if(x_front > 1) {
                answer = x_front + "x";
            } else {
                answer = "x";   
            } // inner if-else
        	
        } // Outter if-else
        
        return answer;
    } // solution
	
} // end class