package ro.ase.cts.statev2;

public class StareRezervata implements State{

	
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare()instanceof StareLibera){
			System.out.println("masa "+ masa.getCod()+"a fost rezrvata");
			masa.setStare(this);
		}
		else {
			System.out.println("msaa nu poate fi ocupata");
		}
	}
}
