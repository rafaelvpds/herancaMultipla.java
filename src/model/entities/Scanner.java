package model.entities;

public class Scanner extends Device {

	public Scanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void porcessDoc(String doc) {
		System.out.println("Scanner Processing " + doc);

	}

	public String scan() {
		return "Scanned content";
	}

}
