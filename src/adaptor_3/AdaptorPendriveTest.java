package adaptor_3;

public class AdaptorPendriveTest {

	public static void main(String[] args) {

		USBPendrive pendrive = new SamsungPendrive();

		Laptop laptop = new Laptop(pendrive);
		laptop.connectToPort();
		
		//demonstrate adpator pattern
		Mobile mobile = new Mobile(new KDM_OTG(pendrive));
		mobile.connectToPort();
	}

}
