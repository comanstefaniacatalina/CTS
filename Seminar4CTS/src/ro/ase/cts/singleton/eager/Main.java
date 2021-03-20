package ro.ase.cts.singleton.eager;

import ro.ase.cts.singleton.lazy.ScoalaPrivata;

public class Main {

	public static void main(String[] args) {
		
		ReceptieHotel receptie1=ReceptieHotel.getInstanta();	
		ReceptieHotel receptie2=ReceptieHotel.getInstanta();
		
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		receptie1.setNumeReceptie("Receptia mare");
		receptie2.setEtaj(4);
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		ScoalaPrivata scoalaPrivata1=ScoalaPrivata.getInstanta("Floricele", 200, 30000);
		ScoalaPrivata scoalaPrivata2=ScoalaPrivata.getInstanta("FloriceleSoarelui", 200, 30000);
		
		scoalaPrivata1.setNumeScoala("Fluturasii");
		scoalaPrivata2.setNrElevi(600);
		
		System.out.println(scoalaPrivata1.toString());
		System.out.println(scoalaPrivata2.toString());
	}
}