package ro.ase.cts.statev2;

public class StareLibera implements State {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			System.out.println("masa"+masa.getCod()+" este eliberata");
			masa.setStare(this);
		}else {
			System.out.println("masa nu poatefi eleiberata");
		}

	}

}
