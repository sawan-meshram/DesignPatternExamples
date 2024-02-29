package adaptor_3;

public class KDM_OTG{

	private USBPendrive pendrive;
	
	public KDM_OTG(USBPendrive pendrive) {
		super();
		this.pendrive = pendrive;
	}


	public void connectToOtg() {
		pendrive.connect();
	}

}
