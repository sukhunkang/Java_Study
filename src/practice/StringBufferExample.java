package practice;

public class StringBufferExample {

	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		String[] arr = {"You ", "only ", "live ", "once."};
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		} // for
		
		System.out.println(sb);
		
	} // main

} // end class
