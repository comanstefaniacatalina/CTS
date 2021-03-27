package ro.ase.cts.prototype;

public class Client implements Copiator {

	private String nume;
	private int varsta;
	public Client(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	public Client() {
		super();
	}
	@Override
	public Copiator copiaza() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
