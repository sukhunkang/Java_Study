// 대소문자 바꿔서 출력하기

package codingtest_level0;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        for(int i=0; i<b.length; i++) {
            if(Character.isUpperCase(b[i])) {
                b[i] = Character.toLowerCase(b[i]);
            } else {
                b[i] = Character.toUpperCase(b[i]);
            }
            System.out.print(b[i]);
        }
    }
}