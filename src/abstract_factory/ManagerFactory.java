package abstract_factory;

public class ManagerFactory extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee() {
		return new Manager();
	}

}
