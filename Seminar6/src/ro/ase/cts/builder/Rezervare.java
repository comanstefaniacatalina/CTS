package ro.ase.cts.builder;

public class Rezervare {

	private boolean scaunErgonomic;
	private boolean mancareInclusa;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", bauturaRacoritoare=");
		builder.append(bauturaRacoritoare);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}

	public Rezervare(boolean scaunErgonomic, boolean mancareInclusa, boolean bauturaRacoritoare,
			boolean muzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.scaunErgonomic = scaunErgonomic;
		this.mancareInclusa = mancareInclusa;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}

	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	public boolean isMancareInclusa() {
		return mancareInclusa;
	}

	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}

	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}

	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	
	
}
