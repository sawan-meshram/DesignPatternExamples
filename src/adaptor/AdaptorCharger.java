package adaptor;

public class AdaptorCharger implements AppleCharger{
	private AndroidCharger charger;
	
	
	public AdaptorCharger(AndroidCharger charger) {
		super();
		this.charger = charger;
	}


	@Override
	public void chargePhone() {
		charger.chargeAndroidPhone();
		System.out.println("Your are charging with adaptor charger");
	}

}
