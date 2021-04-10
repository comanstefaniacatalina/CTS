package ro.ase.cts.decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

	public DecoratorContactlessTelefon(Card card) {
		super(card);
		
	}

	@Override
	public void platesteContactless(int suma) {
		if (super.getCard().getSold() > suma) {
			System.out.println("A facut plata ContactLess cu telefonul in suma de: " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
		
	}

}
