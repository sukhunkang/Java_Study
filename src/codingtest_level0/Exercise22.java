package codingtest_level0;

class Exercise22 {
    public int Exercise22(int a, int b, int c) {
        int answer = 0;
        if( (a!=b) && (b!=c) && (c!=a) ) {
            answer = a+b+c; 
        } else if( (a==b)&&(b==c)&&(c==a) ) {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else{
            answer = (a+b+c)*(a*a+b*b+c*c);
        }
        return answer;
    }
}