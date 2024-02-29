package singleton;

public class Bike {
	private static Bike bike = new Bike();
	
	private Bike() {
		
	}
	
	public static Bike getBikeInstance() {
		return bike;
	}
}
