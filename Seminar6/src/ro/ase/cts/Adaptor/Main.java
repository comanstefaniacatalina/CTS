package ro.ase.cts.Adaptor;

public class Main {
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletPePlatforma(BiletOnline biletOnline) {
		biletOnline.vindeBiletOnline();
		biletOnline.rezervaBiletOnline();
	}

	public static void main(String[] args) {

		Bilet bilet=new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		Adaptor adaptor=new Adaptor(30);
		rezervaSiVindeBiletPePlatforma(adaptor);
		
		BiletOnline biletOnline=new AdaptorBiletObiecte(bilet);
		rezervaSiVindeBiletPePlatforma(biletOnline);
	}

}
