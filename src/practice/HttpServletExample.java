package practice;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	} // main
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	} // method

} // end class
