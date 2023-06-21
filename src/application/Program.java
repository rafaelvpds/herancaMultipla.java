package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcretePrinter p = new ConcretePrinter("1080");
		p.porcessDoc("My Letter");
		p.print("My Lette");

		System.out.println();

		ConcreteScanner s = new ConcreteScanner("2003");
		s.porcessDoc("My email");
		System.out.println("Sacan result " + s.scan());

		System.out.println();

		ComboDevice c = new ComboDevice("2023");
		c.porcessDoc("My dissertetion");
		c.print("Print My dissertetion");
		System.out.println("Scan Result " + c.scan());
	}

}
