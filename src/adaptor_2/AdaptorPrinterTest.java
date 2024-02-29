package adaptor_2;

public class AdaptorPrinterTest {

	public static void main(String[] args) {
		DotMatrixPrinter p1 = new EpsonLX310();
		p1.startDotMatrixPrinter();
		
		InkJetPrinter p2 = new CananPIXMA();
		p2.startInkJetPrinter();
		
		
		InkJetPrinter p3 = new AdaptorLegacyPrinter(new EpsonLX310());
		p3.startInkJetPrinter();

	}

}
