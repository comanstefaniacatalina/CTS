package ro.ase.cts.template;

public abstract class TemplateOcupareMasa {

	protected int cod;
	
	public abstract void curataMasa();
	public abstract void asazaServetele();
	public abstract void asazaTacamuri();
	public abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		asazaServetele();
		asazaTacamuri();
		invitaPersoane();
	}
	
	
	
}
