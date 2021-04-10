package ro.ase.cts.facade;

import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Mami", "1234567898745");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou=new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println();
				}
			}
		}
		
		Persoana pers = new Persoana("Alex","1965784561275");
		if(VerificatorPersoana.esteEligibil(pers)) {
			System.out.println("Persoana este eligibila");
		} else {
			System.out.println("Persoana nu este eligibila");
		}

	}

}
