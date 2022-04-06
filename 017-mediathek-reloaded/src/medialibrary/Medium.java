package medialibrary;

public class Medium {
	private final String title;
	private String lender;
	private boolean lend;

	public Medium (String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getLender() {
		return this.lender;
	}

	public boolean isLend() {
		return this.lend;
	}

	public void lend(String lender) {
		if (!isLend()) {
			this.lender = lender;
			this.lend = true;
		}
	}

	public void giveBack() {
		this.lender = null;
		this.lend = false;
	}
}
