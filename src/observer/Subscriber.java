package observer;

public class Subscriber implements Observer{
	
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	
	@Override
	public void notified(String title) {
		System.out.println("Hello :"+name+", New video upload : "+title);
	}


	@Override
	public String getName() {
		return name;
	}

}
