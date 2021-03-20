package ro.ase.cts.singleton.eager;

public class ReceptieHotel {

	private String numeReceptie;
	private int etaj;
	private String numeHotel;
	private static final ReceptieHotel instanta=new ReceptieHotel("Receptie mica", 3,"UpperHouse");
	
	private ReceptieHotel(String numeReceptie, int etaj, String numeHotel) {
		super();
		this.numeReceptie = numeReceptie;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}

	public void setNumeReceptie(String numeReceptie) {
		this.numeReceptie = numeReceptie;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}
	
	public static ReceptieHotel getInstanta() {
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Receptie Hotel [nume Receptie=");
		builder.append(numeReceptie);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
