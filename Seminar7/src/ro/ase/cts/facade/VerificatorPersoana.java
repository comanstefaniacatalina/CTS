package ro.ase.cts.facade;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;

public class VerificatorPersoana {

	public static boolean esteEligibil(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
