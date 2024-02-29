package adaptor_3;

public class Laptop implements USBPort{
	private USBPendrive pendrive;
	
	
	public Laptop(USBPendrive pendrive) {
		super();
		this.pendrive = pendrive;
	}

	@Override
	public void connectToPort() {
		pendrive.connect();
	}

}
