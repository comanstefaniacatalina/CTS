package ro.ase.cts.state;

public class Main {

	public static void main(String[] args) {

		Masa masa=new Masa(1);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.elibereazaMasa();
	}

}
