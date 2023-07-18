package codingtest_level0;

class Exercise151 {
    
	
	public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        
        if( (dots[0][0]-dots[1][0]) != 0 ) {
            width = Math.abs(dots[0][0]-dots[1][0]);
        } else if( (dots[0][0]-dots[2][0]) != 0 ) {
            width = Math.abs(dots[0][0]-dots[2][0]); 
        } else if( (dots[0][0]-dots[3][0]) != 0 ) {
            width = Math.abs(dots[0][0]-dots[3][0]); 
        } // if-else
        
        
        if( (dots[0][1]-dots[1][1]) != 0 ) {
            height = Math.abs(dots[0][1]-dots[1][1]);
        } else if( (dots[0][1]-dots[2][1]) != 0 ) {
            height = Math.abs(dots[0][1]-dots[2][1]); 
        } else if( (dots[0][1]-dots[3][1]) != 0 ) {
            height = Math.abs(dots[0][1]-dots[3][1]); 
        } // if-else
        
        answer = width * height;
        
        return answer;
    }
	
}