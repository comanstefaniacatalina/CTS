package ro.ase.cts.singleton.lazy;


public class ReceptieHotel {

	private String numeReceptie;
	private int etaj;
	private String numeHotel;
	private static ReceptieHotel instanta=null;
	
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
	
	public static synchronized ReceptieHotel getInstanta(String numeReceptie, int etaj, String numeHotel) {
		if(instanta==null) {
			instanta=new ReceptieHotel(numeReceptie, etaj, numeHotel);
		}
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
