package ro.ase.cts.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata= 10;
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
		
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString()).append("ocupatie").append(this.ocupatie).append("salariu").append(this.salariu);
		return  stringBuilder.toString();
	}
	
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringPentruSumaFinantata(this.sumaFinantata, "Angajatul"));
	}
	
}
