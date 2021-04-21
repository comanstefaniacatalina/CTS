package ro.ase.cts.template;

public class MasaInBar extends Masa{

	public MasaInBar(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void asazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Pe masa "+this.codMasa+" s-au asezat paharele");
	}

}
