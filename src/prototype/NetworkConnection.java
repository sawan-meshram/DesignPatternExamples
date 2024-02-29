package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
	private String ip;
	private String importantData;
	
	private List<String> domains;
	
	public NetworkConnection() {
		System.out.println("From NetworkConnection class");
		domains = new ArrayList<>();
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getImportantData() {
		return importantData;
	}
	
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public void loadVeryImportantData() {
		this.importantData = "Very important data loading....";
		domains.add("www.w3school.com");
		domains.add("www.bing.com");
		domains.add("www.google.com");
		domains.add("www.facebook.com");
		domains.add("www.linkedin.com");
		//It will take 2 sec 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnection conn = new NetworkConnection();
		conn.setIp(this.getIp());
		conn.setImportantData(this.getImportantData());
		for(String val : this.getDomains()) {
			conn.getDomains().add(val);	
		}
		return conn; //deep copy
		
		//return super.clone(); //shallow copy
	}
	
	
	
}
