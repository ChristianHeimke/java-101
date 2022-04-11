
public class MyDivisionException extends Exception {

	private static final long serialVersionUID = 1L;

	private int zaehler = 0;

	public MyDivisionException() {

	}

	public MyDivisionException(String meldung) {
		super(meldung);
	}

	public MyDivisionException(String meldung, int zaehler) {
		super(meldung);
		this.zaehler = zaehler;

	}

	public int getZaehler() {

		return zaehler;
	}

}
