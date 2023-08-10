package codingtest_level0;

class Exercise214 {
 
	
	public int solution(int balls, int share) {
        return combination(balls, share);
    } // solution
    
	
    public int combination(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        } else {
            return combination(balls-1,share-1) + combination(balls-1, share);
        } // if-else
        
    } // combination
    
} // end class
