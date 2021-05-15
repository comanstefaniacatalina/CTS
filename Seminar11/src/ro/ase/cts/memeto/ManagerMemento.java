package ro.ase.cts.memeto;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<Memento> listaMeciuriSalvate;

	public ManagerMemento() {
		super();
		this.listaMeciuriSalvate = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		this.listaMeciuriSalvate.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie>=0&&pozitie<this.listaMeciuriSalvate.size()) {
			return this.listaMeciuriSalvate.get(pozitie);
		}
		throw new IndexOutOfBoundsException();
	}
	
	public Memento undo() {
		return this.listaMeciuriSalvate.get(this.listaMeciuriSalvate.size()-1);
	}
}
