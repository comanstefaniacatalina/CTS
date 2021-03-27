package ro.ase.cts.factoryMethod;

public class FcatoryMijlocas implements Factory{

	@Override
	public Jucator CreeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Mijlocas(numeJucator);
	}

}
