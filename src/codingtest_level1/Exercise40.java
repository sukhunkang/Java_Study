package codingtest_level1;

import java.util.*;


class Exercise40 {
   
	
	public int solution(int k, int m, int[] score) {
        int answer = 0;
     
        List<Integer> list = new ArrayList<>();
        
        //score 내림차순 정렬
        for(int i=0; i<score.length; i++) {
            list.add(score[i]);
        } // for
        
        Collections.sort(list,Collections.reverseOrder());
        
        //사과 상자에 담기
        int length = score.length/m;
        int[][] arr = new int[length][m];
        
        int a=0;
      
        for(int i=0; i<arr.length; i++) {
        
        	for(int j=0; j<m; j++) {
                arr[i][j]=list.get(a);
                a++;
            } // inner-for
        	
        } // Outter-for
        
        //상자에 담긴 사과 중 가장 낮은 점수 구하기
        List<Integer> least = new ArrayList<>();
       
        for(int i=0; i<arr.length; i++) {
            int min=100000;
         
            for(int j=0; j<m; j++) {
            
            	if(arr[i][j] < min) {
                    min = arr[i][j];
                } // if
            	
            } // inner-for
            
            least.add(min);
        } // Outter-for
        
        //최대 이익 구하기
        for(int i=0; i<least.size(); i++) {
            answer += m*least.get(i);
        } // for
        
        return answer;
    } // solution
	
} // end class
