package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare r1= new Rezervare(5, 4, "12");
		Rezervare r2= new Rezervare(10, 2, "12:30");
		Rezervare r3= new Rezervare(2, 5, "15:30");
		
		FlyweightFactory factory = new FlyweightFactory();
		Client client1 = factory.getClient("0734324324");
		client1.printeazaRezervare(r1);
		factory.getClient("07432432421").printeazaRezervare(r2);
		factory.getClient("0734324324").printeazaRezervare(r3);
		
	}

}
