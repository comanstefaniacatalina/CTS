package ro.ase.cts.Adaptor;

public class AdaptorBiletObiecte implements BiletOnline{

	private Bilet bilet;
	
	public AdaptorBiletObiecte(Bilet bilet) {
		this.bilet=bilet;
	}
	
	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		this.bilet.rezerva();
	}
	

}
