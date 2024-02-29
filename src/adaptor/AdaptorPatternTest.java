package adaptor;

public class AdaptorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AppleCharger charger = new ChargerXYZ();
		AppleCharger charger = new AdaptorCharger(new KDMCharger());
		IPhone15 i15  = new IPhone15(charger);
		i15.chargeIPhone();
		
	}

}
