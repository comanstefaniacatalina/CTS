package ro.ase.cts.state;

public class Masa {

	private int cod;
	private State stare;
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare=new StateLibera();				
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu cod "+ cod+" e rezervare");
			this.stare=new StateRezervata();
			}
			else {
				System.out.println("Masa nu poate fi rezervata");
			}
		
	}
	
	public void ocupaMasafaraRezervare() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu cod "+ cod+" e ocupata");
			this.stare=new StateOcupata();}
			else {
				System.out.println("Masa nu poate fi ocupata");
			}
		
	}
	
	public void ridicaMasa() {
		if(this.stare instanceof StateRezervata) {
			System.out.println("Masa cu cod "+ cod+" e ocupata");
			this.stare=new StateOcupata();}
			else {
				System.out.println("Masa nu poate fi ocupata");
			}
		
	}
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof StateLibera )) {
			System.out.println("Masa cu cod "+ cod+" este eliberata");
			this.stare=new StateLibera();
			}
			else {
				System.out.println("Masa este deja libera");
			}
		
	}
	
	
}
