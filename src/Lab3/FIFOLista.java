package Lab3;

public class FIFOLista {
	private FIFOElement first;
	private int liczbaElementow;
	
	public FIFOLista() {
		this.liczbaElementow = 0;
	}

	private boolean jestPusta() {
		return this.liczbaElementow==0;
	}
	
	public void put(String wartosc) {
		if(this.jestPusta()) {
			this.first = new FIFOElement(wartosc);
			this.liczbaElementow++;
		}
		else {
			FIFOElement last = first;
			
			while(last.next!=null) last = last.next;
			
			last.next = new FIFOElement(wartosc);
			this.liczbaElementow++;
		}
	}
	
	public String get() {
		if (this.jestPusta()) {
			return "";
		}
		String wartosc = this.first.wartosc;
		this.first = this.first.next;
		this.liczbaElementow--;
		return wartosc;
	}
	
	public int showSize() {
		return this.liczbaElementow;
	}
	
	public void appendToLast(String s) {
		FIFOElement last = first;
		
		while(last.next!=null) last = last.next;

		last.wartosc = last.wartosc+s;
		
	}
	
	
}
