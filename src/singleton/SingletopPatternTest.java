package singleton;

public class SingletopPatternTest {

	public static void main(String[] args) {
		/*
		 * Below lines produce the same hashcode for every object of same type class 
		 *   
		 */
		
		/*
		 * Below pattern demonstrate Lazy Initialization
		 */
		Car c1 = Car.getCarInstance();
		System.out.println("Car-1 : "+c1.hashCode());
		
		Car c2 = Car.getCarInstance();
		System.out.println("Car-2 : "+c2.hashCode());
		
		/*
		 * Below pattern demonstrate Eager Initialization
		 */
		Bike b1 =  Bike.getBikeInstance();
		System.out.println("bike-1 :"+b1.hashCode());
		
		Bike b2 =  Bike.getBikeInstance();
		System.out.println("bike-2 :"+b2.hashCode());

	}

}
