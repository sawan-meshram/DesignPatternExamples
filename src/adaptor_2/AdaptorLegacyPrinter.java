package adaptor_2;

public class AdaptorLegacyPrinter implements InkJetPrinter{
	private DotMatrixPrinter printer;

	public AdaptorLegacyPrinter(DotMatrixPrinter printer) {
		super();
		this.printer = printer;
	}
	
	@Override
	public void startInkJetPrinter() {
		printer.startDotMatrixPrinter();
	}
	
}
