package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {

		Restaurant r=new Restaurant("ceva", "undeva");
		Client c1=new Client("ion");
		Client c2=new Client("jon");
		Client c3=new Client("bon");
		
		r.adaugaObserver(c1);
		r.adaugaObserver(c2);
		
		r.realizareOfertaPret();
		r.stergeObserver(c2);
		r.adaugaObserver(c3);
		r.introducereMeniu();
	}

}
