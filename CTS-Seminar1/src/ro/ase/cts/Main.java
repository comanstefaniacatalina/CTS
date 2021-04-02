package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal z1=new Zebra("Monica");
		Animal z2=new Zebra("Costel");
		Animal g1=new Girafa("Florica",500);
		
		zoo.AdaugareAnimal(z2);
		zoo.AdaugareAnimal(g1);
		zoo.feedAnimals();
		zoo.mutareAnimale();

	}

}
