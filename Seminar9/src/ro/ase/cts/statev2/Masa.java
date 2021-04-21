package ro.ase.cts.statev2;

public class Masa {

	private State stare;
	private int cod;
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare=new StareLibera();
	}
	public State getStare() {
		return stare;
	}
	void setStare(State stare) {
		this.stare = stare;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public void rezervaMasa() {
		StareRezervata sr=new StareRezervata();
		sr.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareRezervata so=new StareRezervata();
		so.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareRezervata sl=new StareRezervata();
		sl.modificaStare(this);
	}
	
	public void ridicaRezervare() {
		ocupaMasa();
	}
	//daca e impus sa treci prin starea a si apoi prin b si c trebuie prima versiune
	//daca nu e impus e a doua
	
	
}
