package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	public void setDenumireProiect(String[] denumireProiect, int nrProiecte) {
		this.denumireProiect = denumireProiect;
		this.nrProiecte=nrProiecte;
	}
	public void afiseazaStatusPeProiect(Proiect proiect){
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Aplicantul ").append(this.nume).append(" ").append(this.prenume);
		stringBuilder.append(punctaj>proiect.getPragAcceptare() ? " a fost acceptat" : " nu a fost acceptata");
		System.out.println(stringBuilder.toString());
	}
	
	public Aplicant() {
		super();

	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}
	
	public abstract void afisareSumaFinantata();
	
	public String compunereStringPentruSumaFinantata(int suma, String tipAplicant) {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(tipAplicant);
		stringBuilder.append(" ");
		stringBuilder.append(prenume);
		stringBuilder.append(" primeste  ");
		stringBuilder.append(suma);
		stringBuilder.append(" Euro/zi in proiect.");
		
		
		return stringBuilder.toString();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		return builder.toString();
	}
	

}
