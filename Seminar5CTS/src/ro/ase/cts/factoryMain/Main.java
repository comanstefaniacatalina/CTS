package ro.ase.cts.factoryMain;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucator;
import ro.ase.cts.factory.TipJucator;

public class Main {

	public static void main (String[] main) {
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.Portar, "Viorel");
		Jucator fundas=factory.getJucator(TipJucator.Fundas, "Dorel");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}
}
