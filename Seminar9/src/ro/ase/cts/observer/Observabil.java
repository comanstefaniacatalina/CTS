package ro.ase.cts.observer;

public interface Observabil {

	void adaugaObserver(Observer o);
	void stergeObserver(Observer o);
	void trimiteMesaj(String mesaj);
	
}
