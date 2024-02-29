package singleton;

public class Car {
	private static Car car;
	
	private Car() {
		
	}
	
	public static Car getCarInstance() {
		if(car == null) {
			
			synchronized (Car.class) {
				if(car == null)
					car = new Car();
			}
		}
		
		return car;
	}
}
