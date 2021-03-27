package ro.ase.cts.factoryMethod;


public class FactoryFundas implements Factory{

	@Override
	public Jucator CreeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Fundas(numeJucator);
	}

}
