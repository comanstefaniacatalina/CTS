package ro.ase.cts.memeto;

public class Memento {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaAdversar;
	public Memento(int nrSpectatori, String echipaOaspeti, String echipaAdversar) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaOaspeti;
		this.echipaAdversar = echipaAdversar;
	}
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public String getEchipaGazda() {
		return echipaGazda;
	}
	public String getEchipaAdversar() {
		return echipaAdversar;
	}
}
