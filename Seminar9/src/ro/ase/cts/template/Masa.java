package ro.ase.cts.template;

public class Masa extends TemplateOcupareMasa {

	public Masa(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Masa "+this.codMasa+" este curatata");
	}

	@Override
	public void asazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa "+this.codMasa+" s-au asezat servetelele");
	}

	@Override
	public void asazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa "+this.codMasa+" s-au asezat tacamurile");
	}

	@Override
	public void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("La masa "+this.codMasa+" au fost invitate persoanele");
		
	}

}
