package ro.ase.cts.Adaptor;

public class Bilet {

	private int pret;

	public Bilet(int pret) {
		super();
		this.pret = pret;
	}
	
	
	public void vinde() {
		System.out.println(" s a vandut biletu cu pretul"+this.pret);
	}
	
	public void rezerva() {
		System.out.println(" s a rezervat biletu cu pretul"+this.pret);
	}
}
