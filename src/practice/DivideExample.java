// 600�ڷ��� ������ 43���� �л��鿡�� ������ �� �� 1�δ� �� ���� ���� �� �ְ� �� ���� ������ ���ϱ�

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