package prototype;

/**
 * Prototype design pathern have two types.
 * 1) Shallow Copy (it will copy the object reference from used class)
 * 2) Deep Copy (it will clone the object from used class)
 * 
 * @author Sawan
 */
public class PrototypePatternTest {

	public static void main(String[] args) {
		
		NetworkConnection connection = new NetworkConnection();
		connection.setIp("192.162.0.150:3309");
		connection.loadVeryImportantData();
		
		System.out.println(connection);

		/*
		 * Creating a clone object
		 */
		NetworkConnection conn = null;
		try {
			conn = (NetworkConnection) connection.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		
		//after removing the object from list, the changes to copy object of NetworkConnection. It demonstrate the shallow copy 
		connection.getDomains().remove(0);
		System.out.println(connection);
		System.out.println(conn);

	}

}
