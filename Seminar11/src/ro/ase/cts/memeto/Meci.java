package ro.ase.cts.memeto;

public class Meci {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaAdversar;
	private int nrBilete;
	private int nrJandarmi;
	public Meci(int nrSpectatori, String echipaGazda, String echipaAdversar, int nrBilete, int nrJandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaAdversar = echipaAdversar;
		this.nrBilete = nrBilete;
		this.nrJandarmi = nrJandarmi;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}
	public void setEchipaAdversar(String echipaAdversar) {
		this.echipaAdversar = echipaAdversar;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento creeazaMemento() {
		return new Memento(nrSpectatori, echipaGazda, echipaAdversar);
		
	}
	
	public void setMemento(Memento memento) {
		this.nrSpectatori=memento.getNrSpectatori();
		this.echipaGazda=memento.getEchipaGazda();
		this.echipaAdversar=memento.getEchipaAdversar();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meci [nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaAdversar=");
		builder.append(echipaAdversar);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
