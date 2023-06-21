package model.entities;

public class Printer extends Device {

	public Printer(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void porcessDoc(String doc) {
		System.out.println("Printer processing " + doc);

	}

	public void print(String doc) {
		System.out.println("Printing " + doc);
	}

}