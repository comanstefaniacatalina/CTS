package ro.ase.cts.Adaptor;

public class Adaptor extends Bilet implements BiletOnline {

	public Adaptor(int pret) {
		super(pret);

	}

	@Override
	public void vindeBiletOnline() {

		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {

		super.rezerva();
	}

}
