package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1=new Client("Marcel", 23);
		Client client2=(Client)client1.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet b1=new Bilet(23, "echipa1", "ech2", "12:00");
		Bilet b2=(Bilet) b1.copiaza();
		b2.setCod(11);
		Bilet b3=(Bilet) b1.copiaza();
		b3.setCod(12);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
