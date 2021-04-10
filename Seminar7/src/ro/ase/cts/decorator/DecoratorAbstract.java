package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardBancar{

	private Card card;
	
	
	public DecoratorAbstract(Card card) {
		super();
        this.card = card;
    }
    

    public Card getCard() {
        return card;
    }
	
	@Override
	public void platestePOS(int suma) {
		this.card.platestePOS(suma);
		
	}

	@Override
	public void platesteOnline(int suma) {
		this.card.platesteOnline(suma);
		
	}
	public abstract void platesteContactless(int suma);

	
}
