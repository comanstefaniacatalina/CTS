package ro.ase.cts.builder;

public class MainBuilder {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(false, false, true, true, "manele", 123);

		System.out.println(rezervare);
		
		Rezervare rezervare2=new Builder().setMancareInclusa(true).setGenMuzica("Manele").build();
		
		System.out.println(rezervare2);
		
		Rezervare rezervare3=new Builder(155).setMancareInclusa(true).build();
	
		System.out.println(rezervare3);
		
		BuilderV2 builder=new BuilderV2();
		builder.setMancareinclusa(true);
		Rezervare r3=builder.setCodRezervare(4).build();
		
		System.out.println(r3);
	}

}
