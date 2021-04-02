package clase;

public class Girafa extends Animal{

	private int inaltime;
	
	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	public Girafa(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}

	public Girafa(String nume) {
		super(nume);
		this.inaltime=400;
		// TODO Auto-geerated constructor stub
	}

	@Override
	public void merge() {
		// TODO Auto-generated method stub
		System.out.println("girafa merge cu capul pe sus");
	}
	

}
