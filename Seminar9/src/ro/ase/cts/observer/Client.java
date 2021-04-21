package ro.ase.cts.observer;

public class Client implements Observer{

	private String name;
	
	
	
	public Client(String name) {
		super();
		this.name = name;
	}



	@Override
	public void primesteMesaj(String mesaj) {
		
		System.out.println("Clientul "+name +"a primit mesajul "+ mesaj);
	}

}
