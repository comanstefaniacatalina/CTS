package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Observabil{
	private List<Observer> obsList;
	private String nume;
	private String adresa;
	
	

	public Restaurant( String nume, String adresa) {
		super();
		this.obsList = new ArrayList<>();
		this.nume = nume;
		this.adresa = adresa;
	}

	@Override
	public void adaugaObserver(Observer o) {
		// TODO Auto-generated method stub
		this.obsList.add(o);
	}

	@Override
	public void stergeObserver(Observer o) {
		// TODO Auto-generated method stub
		this.obsList.remove(o);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer o: this.obsList) {
			o.primesteMesaj("rest"+this.nume+" "+this.adresa+"va trimite mesa"+mesaj);
		}
	}
	
	public void realizareOfertaPret() {
		trimiteMesaj(" ofera");
	}
	
	public void introducereMeniu() {
		trimiteMesaj("in meniu");
	}

}
