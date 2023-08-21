package practice;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("Same ShopService object.");
		} else {
			System.out.println("Different ShopService object.");
		} // if-else
		
	} // main

} // end class
