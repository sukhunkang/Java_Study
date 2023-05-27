// 600자루의 연필을 43명의 학생들에게 나누어 줄 때 1인당 몇 개를 가질 수 있고 몇 개가 남는지 구하기

package practice;

public class DivideExample {
	public static void main(String[] args) {
		int pencils = 600;
		int students = 43;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}