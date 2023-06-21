package model.entities;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo Printing " + doc);

	}

	@Override
	public String scan() {

		return "Combo Scanner ";
	}

	@Override
	public void porcessDoc(String doc) {
		System.out.println("Combo Processing " + doc);

	}

}
