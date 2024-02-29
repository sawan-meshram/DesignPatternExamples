package iterator;

public class IteratorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManagement manage =  new UserManagement();
		manage.addUser(new User(101, "Raju"));
		manage.addUser(new User(102, "Shamu"));
		manage.addUser(new User(103, "Gomu"));
		manage.addUser(new User(104, "Raj"));
		
		UserIterator it = manage.getIterator();
		while(it.hasNext()) {
			User user = (User) it.next();
			System.out.println(user);
		}
	}

}
