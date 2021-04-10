package ro.ase.cts.decorator;

public class Card implements CardBancar{
	private String titular;
	private int sold;
	
	
	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public String getTitular() {
		return titular;
	}

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}
	

	@Override
	public void platestePOS(int suma) {
		// TODO Auto-generated method stub
		
		if(sold>suma) {
			System.out.println(this.titular+ " a platit cu POS");
			sold-=suma;
		}
	}

	@Override
	public void platesteOnline(int suma) {
		// TODO Auto-generated method stub
		if(sold>suma) {
			System.out.println(this.titular+ " a platit normal");
			sold-=suma;
		}
	}

}
