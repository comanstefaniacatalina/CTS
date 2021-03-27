package ro.ase.cts.factoryMethodMain;

import ro.ase.cts.factoryMethod.Factory;
import ro.ase.cts.factoryMethod.FactoryFundas;
import ro.ase.cts.factoryMethod.FactoryPortar;
import ro.ase.cts.factoryMethod.FcatoryMijlocas;
import ro.ase.cts.factoryMethod.Jucator;

public class Main {
	
	private static void afiseazaJucator(Factory factory, String numeJucator) {
	
		Jucator jucator=factory.CreeazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}

	public static void main (String[] main) {
		afiseazaJucator(new FactoryPortar(),"mihai");
		afiseazaJucator(new FactoryFundas(),"mihai");
		afiseazaJucator(new FcatoryMijlocas(),"Vlad");
		
	}
}
