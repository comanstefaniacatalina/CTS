package ro.ase.cts.chain;

public class ContCredit extends Cont{

	public ContCredit(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(super.getSold() >= suma){
            System.out.println("Se realizeaza plata din contul de credit in valoare de " + suma);
            super.setSold(super.getSold()-suma);
            System.out.println("Sold cont curent = " + super.getSold());
        }
        else if(super.getSuccesorCont() != null){
            super.getSuccesorCont().realizeazaPlata(suma);
        }
        else
            System.out.println("Nu se poate realiza plata");
	}

}
