package codingtest_level1;

import java.util.Scanner;


class Exercise31 {
  
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        for(int i=0; i<m; i++) {
           
        	for(int j=0; j<n; j++) {
                System.out.print("*");
            } // inner for
        	
            System.out.println();
        } // Outter for
        
    } // solution
	
} // end class
