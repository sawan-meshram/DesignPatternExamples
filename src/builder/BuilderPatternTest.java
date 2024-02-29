package builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		/*
		 * First approach
		 */
		User u1 = new User.UserBuilder()
				.setUserId("101")
				.setUserName("Salman Khan")
				.setEmail("salmankhan@gmail.com")
				.build();
		
		System.out.println(u1);

		/*
		 * Second approach
		 */
		User u2 = User.UserBuilder.builder()
				.setUserId("105")
				.setUserName("Saif Khan")
				.setEmail("saifkhan@gmail.com")
				.build();
		
		System.out.println(u2);
		
	}

}
