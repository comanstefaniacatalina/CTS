package ro.ase.cts.builder;



public class BuilderV2 implements AbstractBuilder{

	private boolean scaunErgonomic;
	private boolean mancareInclusa;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV2() {
		this.mancareInclusa=false;
		this.scaunErgonomic=false;
		this.codRezervare=0;
		this.muzicaAmbientala=false;
		this.genMuzica="";
		
	}
	
	public BuilderV2 setMancareinclusa(boolean mancareinclusa) {
		this.mancareInclusa = mancareinclusa;
		return this;
	}

	public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public BuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}


	public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public BuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	public BuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	
	@Override
	public Rezervare build() {
		return new Rezervare(scaunErgonomic, mancareInclusa, bauturaRacoritoare, muzicaAmbientala, genMuzica, codRezervare );
	}
}
