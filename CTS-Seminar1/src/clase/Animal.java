package clase;

public abstract class Animal {
	 private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Animal(String nume) {
		super();
		this.nume = nume;
	}
}
