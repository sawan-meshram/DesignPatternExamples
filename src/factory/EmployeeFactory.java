package factory;

public class EmployeeFactory {

	public static Employee getEmployee(String employee) {
		if(employee.trim().equalsIgnoreCase("Android Developer"))
			return new AndroidDeveloper();
		else if (employee.trim().equalsIgnoreCase("Web Developer"))
			return new WebDeveloper();
		else
			return null;
	}
}
