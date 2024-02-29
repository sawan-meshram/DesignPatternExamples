package abstract_factory;


public class WebDeveloper implements Employee {

	public WebDeveloper() {
		System.out.println("From WebDeveloper class");
	}
	@Override
	public double salary() {
		return 20_000.00;
	}

	@Override
	public String name() {
		return "Rajat";
	}

}
