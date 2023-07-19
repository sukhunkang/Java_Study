package codingtest_level0;

class Exercise154 {
    
	
	public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a==b && b==c && c==d) {
            answer = 1111 * a;
        } // if
        
        if(a==b && b==c && c!=d) {
            answer = (int) Math.pow(10*a+d,2);
        } // if
        
        if(a==b && b==d && d!=c) {
            answer = (int) Math.pow(10*a+c,2);
        } // if
        
        if(a==c && c==d && d!=b) {
            answer = (int) Math.pow(10*a+b,2);
        } // if
        
        if(b==c && c==d && d!=a) {
            answer = (int) Math.pow(10*b+a,2);
        } // if
        
        if(a==b && c==d && a!=c) {
            answer = (int) (a+c)*(Math.abs(a-c));
        } // if
        
        if(a==c && b==d && a!=b) {
            answer = (int) (a+b)*(Math.abs(a-b));
        } // if
         
        if(a==d && b==c && a!=b) {
            answer = (int) (a+b)*(Math.abs(a-b));
        } // if
        
        if(a==b && c!=d && c!=a && d!=a) {
            answer = c*d;
        } // if
        
        if(a==c && b!=d && b!=a && d!=a) {
            answer = b*d;
        } // if
        
        if(a==d && b!=c && b!=a && c!=a) {
            answer = c*b;
        } // if
        
        if(b==c && a!=d && a!=b && d!=b) {
            answer = a*d;
        } // if
        
        if(b==d && a!=c && a!=b && c!=b) {
            answer = a*c;
        } // if
        
        if(c==d && a!=b && a!=c && b!=c) {
            answer = a*b;
        } // if
        
        
        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
            
        	if(a<b && a<c && a<d) {
                answer = a;
            } else if(b<a && b<c && b<d) {
                answer = b;
            } else if(c<a && c<b && c<d) {
                answer = c;
            } else if(d<a && d<b && d<c) {
                answer = d;
            } // if-else
        	
        } // Outter-if
        
        
        return answer;
    } // solution
	
} // end class