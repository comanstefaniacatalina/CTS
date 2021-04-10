package ro.ase.cts.composite;

public interface Sediu {

	void descriere();
	void adaugaSediu(Sediu sediu) throws Exception;
	void stregeSediu(Sediu sediu) throws Exception;
	Sediu getSediu(int pozitie) throws Exception;
}
