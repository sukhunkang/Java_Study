// q�� �Է��ϸ� �ݺ� �����ϴ� �ڵ�

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
		
		System.out.println("����");
	}
}
