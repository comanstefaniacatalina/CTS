package ro.ase.cts.chain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Cont contCurent = new ContCurent(200, "roadorviata");
	        Cont contCredit = new ContCredit(150, "ibanban ban");
	        Cont contEconomii = new ContEconomii(150, "mama are mere");

	        contCurent.setSuccesorCont(contCredit);
	        contCredit.setSuccesorCont(contEconomii);

	        contCurent.realizeazaPlata(100);
	        contCurent.realizeazaPlata(150);
	        contCurent.realizeazaPlata(100);
	        contCurent.realizeazaPlata(100);
	        contCurent.realizeazaPlata(100);
	}

}
