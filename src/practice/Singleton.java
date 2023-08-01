package practice;

public class Singleton {
	private static Singleton obj;
	
	static {
		obj = new Singleton();
	} // Static initializer
	
	private Singleton() {
		
	} // Constructor
	
	public static Singleton getInstance() {
		return Singleton.obj;
	} // getInstance method

} // end class
