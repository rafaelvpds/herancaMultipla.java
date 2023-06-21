package application;

import model.entities.Printer;
import model.entities.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p = new Printer("1080");
		p.porcessDoc("My Letter");
		p.print("My Lette");

		Scanner s = new Scanner("2003");
		s.porcessDoc("My email");
		System.out.println("Sacan result " + s.scan());
	}

}
