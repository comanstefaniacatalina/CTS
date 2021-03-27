package ro.ase.cts.factoryMethod;


public class FactoryPortar implements Factory{

	@Override
	public Jucator CreeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Portar(numeJucator);
	}

}
