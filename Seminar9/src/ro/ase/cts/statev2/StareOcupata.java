package ro.ase.cts.statev2;

public class StareOcupata implements State{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare()instanceof StareOcupata)){
			System.out.println("masa "+ masa.getCod()+"a fost ocupata");
			masa.setStare(this);
		}
		else {
			System.out.println("msaa nu poate fi ocupata");
		}
	}

	
}
