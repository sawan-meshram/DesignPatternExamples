package adaptor_3;

public class SamsungPendrive implements USBPendrive {

	@Override
	public void connect() {
		System.out.println("Sumsung pendrive connect vis USB and transferring the data...");
	}

}
