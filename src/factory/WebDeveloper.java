package factory;

public class WebDeveloper implements Employee {

	public WebDeveloper() {
		System.out.println("WebDeveloper class");
	}
	
	@Override
	public double salary() {
		return 20000.00;
	}

}
