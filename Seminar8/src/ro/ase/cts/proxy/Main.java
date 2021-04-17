package ro.ase.cts.proxy;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operator=new OperatorRezervari();
		operator.realizeazaRezervare("Marin", 4);

		Proxy proxy=new Proxy(operator, 4);
		proxy.realizeazaRezervare("mama", 5);
		proxy.realizeazaRezervare("misu", 2);
	}

}
