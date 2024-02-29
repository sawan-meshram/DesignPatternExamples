package adaptor_3;

public class Mobile implements USBPort{

	private KDM_OTG otgPort;
	
	public Mobile(KDM_OTG otg) {
		super();
		this.otgPort = otg;
	}

	@Override
	public void connectToPort() {
		otgPort.connectToOtg();
		
	}
	
	
	
}
