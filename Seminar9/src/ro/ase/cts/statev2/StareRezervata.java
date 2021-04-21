package ro.ase.cts.statev2;

public class StareRezervata implements State{

	
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa cu numarul " + masa.getCod() + " a fost rezervata.");
			masa.setStare(this);
		}else {
			System.out.println("Masa nu poate fi rezervata.");
		}
	}
}
