package ro.ase.cts.template;

public class OcupareMasa extends TemplateOcupareMasa{

	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa"+this.cod+"e curatata");
	}

	@Override
	public void asazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa"+this.cod+" s au asezat servetelele");
	}

	@Override
	public void asazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa"+this.cod+"s au asezat tacamuri");
	}

	@Override
	public void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa"+this.cod+" au fost invitate persoanele");
	}

}
