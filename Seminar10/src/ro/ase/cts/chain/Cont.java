package ro.ase.cts.chain;

public abstract class Cont {

	private float sold;
    private Cont succesorCont;
    private String iban;
	
    
    
	public Cont(float sold, String iban) {
		super();
		this.sold = sold;
		this.iban = iban;
		succesorCont=null;
	}

	public float getSold() {
		return sold;
	}


	public void setSold(float sold) {
		this.sold = sold;
	}


	public Cont getSuccesorCont() {
		return succesorCont;
	}


	public void setSuccesorCont(Cont succesorCont) {
		this.succesorCont = succesorCont;
	}


	public abstract void realizeazaPlata(float suma);
}
