package abstract_factory;

public class WebDevFactory extends AbstractEmployeeFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}
