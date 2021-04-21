package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {

		Restaurant res = new Restaurant("Restaurant", "Str. Bucuresti");
		Client c1 = new Client("Ion");
		Client c2= new Client("Ioana");
		Client c3= new Client("Mihai");
		
		res.adaugaObserver(c1);
		res.adaugaObserver(c2);
		res.realizeazaOfertaPret();
		res.stergeObserver(c2);
		res.adaugaObserver(c3);
		
		res.introduceMeniu();
	}

}
