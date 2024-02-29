package factory;

public class AndroidDeveloper implements Employee {

	public AndroidDeveloper() {
		System.out.println("AndroidDeveloper class");
	}
	
	@Override
	public double salary() {
		return 30000.00;
	}

}
