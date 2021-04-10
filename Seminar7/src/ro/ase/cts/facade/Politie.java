package ro.ase.cts.facade;

import ro.ase.cts.facade.Persoana;

public class Politie {

	public static boolean esteUrmarit(Persoana persoana) {
		if (Integer.parseInt("" + persoana.getCNP().charAt(12)) % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
