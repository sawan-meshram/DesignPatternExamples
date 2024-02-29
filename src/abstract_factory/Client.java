package abstract_factory;

public class Client {

	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println("Name :"+e1.name());
		System.out.println("Salary :"+e1.salary());

		Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
		System.out.println("Name :"+e2.name());
		System.out.println("Salary :"+e2.salary());

		Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println("Name :"+e3.name());
		System.out.println("Salary :"+e3.salary());
	}

}
