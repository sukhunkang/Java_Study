package codingtest_level0;

class Exercise224 {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        String d = "right";
        
        while(num <= n*n) {
            answer[row][col] = num++;
            
            switch(d) {
               
            	case "right":
                   
            		if(col==n-1 || answer[row][col+1] != 0 ) {
                        d = "down";
                        row++;
                    } else {
                        col++;
                    } // if-else
            		
                    break;
                
                case "down":
                  
                	if(row==n-1 || answer[row+1][col] != 0) {
                        d = "left";
                        col--;
                    } else {
                        row++;
                    } // if-else
                	
                    break;
                
                case "left":
                    
                	if(col==0 || answer[row][col-1] != 0) {
                        d = "up";
                        row--;
                    } else {
                        col--;
                    } // if-else
                	
                    break;
                
                case "up":
                   
                	if(row==0 || answer[row-1][col] != 0) {
                        d = "right";
                        col++;
                    } else {
                        row--;
                    } // if-else
                	
                    break;
                    
            } // switch-case 
                
        } // while
        
        return answer;
    } // solution
    
} // end class