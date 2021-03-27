package ro.ase.cts.factoryMethod;


public class FactoryAtacant implements Factory {

	@Override
	public Jucator CreeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Atacant(numeJucator);
	}

	
}
