package factory;

public class DeveloperClient {

	public static void main(String[] args) {
		/*
		 * Factory provide loose coupling
		 */
		Employee e1 = EmployeeFactory.getEmployee("Android developer");
		System.out.println("Salary :"+e1.salary());
		
		Employee e2 = EmployeeFactory.getEmployee("Web developer");
		System.out.println("Salary :"+e2.salary());
	}

}
