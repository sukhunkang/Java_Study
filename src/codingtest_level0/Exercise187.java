package codingtest_level0;

class Exercise187 {
    
	
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++) {
          
        	if(keyinput[i].equals("up")) {
                answer[1]++;
               
                if((int) Math.abs(answer[1]) > board[1]/2) {
                    answer[1]--;
                } // if
                
            } else if(keyinput[i].equals("down")) {
                answer[1]--;
                
                if((int) Math.abs(answer[1]) > board[1]/2) {
                    answer[1]++;
                } // if
                
            } else if(keyinput[i].equals("left")) {
                answer[0]--;
                
                if((int) Math.abs(answer[0]) > board[0]/2) {
                    answer[0]++;
                } // if
                
            } else if(keyinput[i].equals("right")) {
                answer[0]++;
               
                if((int) Math.abs(answer[0]) > board[0]/2) {
                    answer[0]--;
                } // if
                
            } // if-else
        	
        } // for
        
        return answer;
    } // solution
	
} // end class