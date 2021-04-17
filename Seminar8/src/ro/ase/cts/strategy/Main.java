package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {

		Client client=new Client("gigel", new PlataCard());
		client.platesteNota(230);
		client.setModPlata(new PlataCash());
		client.platesteNota(20);
	}

}
