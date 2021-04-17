package ro.ase.cts.proxy;

public class Proxy implements IOperatorRezervari{

	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	public Proxy(OperatorRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinimPersoane;
	}
	
	


	@Override
	public void realizeazaRezervare(String numeClient, int nr) {
		if(nr>=nrMinimPersoane) {
			operator.realizeazaRezervare(numeClient, nr);
		}
		else {
			System.out.println("va rugam mergeti inauntru ");
		}
		
	}

	
}
