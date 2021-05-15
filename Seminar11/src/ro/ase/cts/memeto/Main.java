package ro.ase.cts.memeto;

public class Main {

	public static void main(String[] args) {

		Meci meci=new Meci(200, "Dinamo", "Steaua", 200, 30);
		
		Memento memento=meci.creeazaMemento();
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci.setEchipaAdversar("real");
		meci.setEchipaGazda("fcsb");
		meci.setNrSpectatori(290);
		manager.adaugaMemento(meci.creeazaMemento());
		System.out.println(meci.toString());
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());
	}

}
