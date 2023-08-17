package codingtest_level0;

class Exercise222 {
    
    
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i=0; i<board.length; i++) {
            
            for(int j=0; j<board[i].length; j++) {
               
                if(board[i][j] % 2 != 0) {
                   
                    if(i-1>=0) {
                        board[i-1][j] += 2;
                        
                        if(j-1>=0) {
                            board[i-1][j-1] += 2;
                        } // first if
                        
                    } // Second if
                    
                    if(j-1>=0) {
                        board[i][j-1] += 2;
                    } // Second if
                    
                    if(i+1<board.length) {
                        board[i+1][j] += 2;
                        
                        if(j+1<board[i].length) {
                            board[i+1][j+1] += 2;
                        } // First if
                        
                    } // Second if
                    
                    if(j+1<board[i].length) {
                        board[i][j+1] += 2;
                    } // Second if
                    
                    if(i+1<board.length && j-1>=0) {
                        board[i+1][j-1] += 2;
                    } // Secoond if
                    
                    if(i-1>=0 && j+1<board[i].length) {
                        board[i-1][j+1] += 2;
                    } // Second if
                     
                } // Third if
          
            } // inner for
            
        } // Outter for
        
        for(int i=0; i<board.length; i++) {
           
            for(int j=0; j<board[i].length; j++) {
               
                if(board[i][j] == 0) {
                    answer++;
                } // if
                
            } // inner for
            
        } // Outter for
        
        return answer;
    } // solution
    
} // end class
