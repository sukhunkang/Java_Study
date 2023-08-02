package practice;

public class StringBuilderExample {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		String str1 = "Hello ";
		String str2 = "World!";
		
		sb.append(str1);
		sb.append(str2);
		
		System.out.println(sb); 
	} // main

} // end class
