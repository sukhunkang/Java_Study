package codingtest_level0;

import java.util.*;


class Solution {
    
    
    public double Slope(int a1, int a2, int b1, int b2) {
        double slope = 0;
        slope = (double)(b2-a2) / (b1-a1);
        return slope;
    } // slope
    
    
    public int solution(int[][] dots) {
        int answer = 0;
        List<Double> list = new ArrayList<>();
        
        
        for(int i=0; i<dots.length; i++) {
            
            for(int j=i+1; j<dots.length; j++) {
                double sl = Slope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                list.add(sl);
            } // inner-for
        
        } // Outter-for
        
        
        Double[][] arr = { {list.get(0),list.get(5)}, {list.get(1),list.get(4)}, {list.get(2),list.get(3)} }; 
        
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i][0].equals(arr[i][1])) {
                answer = 1;
                break;
            } // if
            
        } // for
        
        
        return answer;
        
    } // solution
    
} // end class