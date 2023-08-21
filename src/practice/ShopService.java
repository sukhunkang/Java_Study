package practice;

public class ShopService {
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	} // Constructor
	
	static ShopService getInstance() {
		return singleton;
	} // getInstance
	
} // end class
