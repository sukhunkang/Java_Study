package practice;

public class AnonymousExample1 {

	
	public static void main(String[] args) {
		Anonymous1 anony1 = new Anonymous1();
		anony1.field.start();
		anony1.method1();
		anony1.method2(
					new Worker() {
						@Override 
						public void start() {
							System.out.println("Testing");
						}
					}
				);
	} // main

} // end class
