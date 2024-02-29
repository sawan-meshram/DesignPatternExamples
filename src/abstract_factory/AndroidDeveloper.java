package abstract_factory;


public class AndroidDeveloper implements Employee {
	public AndroidDeveloper() {
		System.out.println("From AndroidDeveloper class");
	}
	
	@Override
	public double salary() {
		return 30_000.00;
	}

	@Override
	public String name() {
		return "Amish";
	}

}
