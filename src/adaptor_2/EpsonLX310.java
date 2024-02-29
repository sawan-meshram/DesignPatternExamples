package adaptor_2;

public class EpsonLX310 implements DotMatrixPrinter{

	@Override
	public void startDotMatrixPrinter() {
		System.out.println("Starting printing on continuous paper using DotMatrix printer ....");
	}

}
