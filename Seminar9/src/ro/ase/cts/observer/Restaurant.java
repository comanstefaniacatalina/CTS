package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Observabil{
	private List<Observer> observerList;
	private String nume;
	private String adresa;
	
	

	public Restaurant( String nume, String adresa) {
		super();
		this.observerList = new ArrayList<>();
		this.nume = nume;
		this.adresa = adresa;
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.observerList.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		this.observerList.remove(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer : this.observerList) {
			observer.primesteMesaj("Restaurantul " + this.nume + " de la adresa "+ adresa +" va transmite: "+ mesaj) ;
		}
	}
	
	void realizeazaOfertaPret() {
		trimiteMesaj("S-a realizat o oferta de pret.");
	}

	void introduceMeniu() {
		trimiteMesaj("S-a introdu un nou meniu");
	}

}
