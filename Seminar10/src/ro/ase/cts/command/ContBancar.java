package ro.ase.cts.command;

public class ContBancar {

	private String iban;
	private float sold;
	
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold=sumaInitiala;
		System.out.println("s a constituit contul cu suma");
	}
	
	public void retragere(float suma) {
		if(sold>=suma) {
			sold-=suma;
			System.out.println("s au retras");
		}else {
			System.out.println("nu sunt fonduri");
		}
		
	}
	
	public void depunere(float suma) {
		this.sold+=sold;
		System.out.println("s a depus suma");
	}
	
}
