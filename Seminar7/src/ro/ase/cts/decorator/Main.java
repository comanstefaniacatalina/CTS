package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
		Card card=new Card("Ion",3000);
		card.platesteOnline(200);
		card.platestePOS(300);
		
		Decorator cardNou=new Decorator(card);
		cardNou.platesteContactless(400);
		cardNou.platesteOnline(200);
		cardNou.platestePOS(100);
		
		DecoratorContactlessTelefon decoratorContactless=new DecoratorContactlessTelefon(card);
		decoratorContactless.platesteContactless(300);

	}

}
