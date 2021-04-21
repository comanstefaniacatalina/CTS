package ro.ase.cts.statev2main;

import ro.ase.cts.statev2.Masa;
import ro.ase.cts.statev2.StareLibera;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Masa masa=new Masa(10);
		masa.ocupaMasa();
		masa.rezervaMasa();
		//masa.setStare(new StareLibera());
		//masa.rezervaMasa();
		//fara sa avem public acolo la setter
		masa.elibereazaMasa();
	}

}
