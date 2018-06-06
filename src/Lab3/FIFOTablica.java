package Lab3;

public class FIFOTablica {

	private int[] tablica;
	private int wielkoscTablicy;
	private int licznik;
	private int liczbaElementow;
	
	public FIFOTablica(int wielkosc) {
		this.wielkoscTablicy = wielkosc;
		this.tablica = new int[wielkosc];
		this.licznik = 0;
		this.liczbaElementow = 0;
	}
	
	private boolean jestPelna() {
		return this.wielkoscTablicy==this.liczbaElementow;
	}
	private boolean jestPusta() {
		return this.liczbaElementow==0;
	}
	
	public void put(int wartosc) {
		if (this.jestPelna()) System.out.println("Kolejka jest pelna");
		else {
			this.tablica[(this.liczbaElementow+this.licznik)%this.wielkoscTablicy] = wartosc;
			this.liczbaElementow++;
		}
	}
	public int get() {
		if (this.jestPusta()) {
			System.out.println("Kolejka jest pusta");
			return 0;
		}
		int wartosc = this.tablica[this.licznik%this.wielkoscTablicy];
		this.liczbaElementow--;
		this.licznik++;
		return wartosc;
	}
	
}
