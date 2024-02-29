package abstract_factory;

public class Manager implements Employee {

	public Manager() {
		System.out.println("From Manager class");
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Karan";
	}

	@Override
	public double salary() {
		return 40_000.00;
	}

}
