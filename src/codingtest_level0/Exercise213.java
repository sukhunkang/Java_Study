package codingtest_level0;

class Exercise213 {
    
	
	public String[] solution(String[] quiz) {
        String[] answer = {};
        String[][] arr = new String[quiz.length][5];
        answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            arr[i] = quiz[i].split(" ");
        } // for
        
        for(int i=0; i<arr.length; i++) {
            int a = Integer.parseInt(arr[i][0]);
            int b = Integer.parseInt(arr[i][2]);
            int c = Integer.parseInt(arr[i][4]);
            
            if(arr[i][1].equals("+")) {
              
            	if(a+b==c) {
                    answer[i]="O";
                } else {
                    answer[i]="X";
                } // inner if-else
            	
            } else if(arr[i][1].equals("-")) {
               
            	if(a-b==c) {
                    answer[i]="O";
                } else {
                    answer[i]="X";
                } // inner if-else
            	
            } // Outter if-else
            
        } // for
        
        return answer;
    } // solution
	
} // end class