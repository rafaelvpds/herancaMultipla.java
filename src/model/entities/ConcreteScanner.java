package model.entities;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void porcessDoc(String doc) {
		System.out.println("Scanner Processing " + doc);

	}

	@Override
	public String scan() {
		return "Scanned content";
	}

}
