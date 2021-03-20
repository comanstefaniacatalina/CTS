package ro.ase.cts.singleton.lazy;

public class ScoalaPrivata {

	private String numeScoala;
	private int nrElevi;
	private double costScoala;
	private static ScoalaPrivata instanta=null;
	
	private ScoalaPrivata(String numeScoala, int nrElevi, double costScoala) {
		super();
		this.numeScoala = numeScoala;
		this.nrElevi = nrElevi;
		this.costScoala = costScoala;
	}

	public static synchronized ScoalaPrivata getInstanta(String scoalaPrivata, int nrElevi, double costScoala) {
		if(instanta==null) {
			instanta=new ScoalaPrivata(scoalaPrivata, nrElevi, costScoala);
		}
		return instanta;
	}

	public void setNumeScoala(String numeScoala) {
		this.numeScoala = numeScoala;
	}

	public void setNrElevi(int nrElevi) {
		this.nrElevi = nrElevi;
	}

	public void setCostScoala(double costScoala) {
		this.costScoala = costScoala;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScoalaPrivata [numeScoala=");
		builder.append(numeScoala);
		builder.append(", nrElevi=");
		builder.append(nrElevi);
		builder.append(", costScoala=");
		builder.append(costScoala);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
