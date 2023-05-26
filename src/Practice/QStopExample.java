// q를 입력하면 반복 종료하는 코드

package Practice;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		boolean stop = false;
		
		while(!stop) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 'q') {
				break;
			}
		}
		
		System.out.println("종료");
	}
}
