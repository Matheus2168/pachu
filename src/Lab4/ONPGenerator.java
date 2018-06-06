package Lab4;

public class ONPGenerator {

	private FIFOLista kolejka;
	private Stack stos;
	
	/* https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska#Algorytm_konwersji_z_notacji_infiksowej_do_ONP */
	
	public ONPGenerator() {
		kolejka = new FIFOLista();
		stos = new Stack();
	}
	
	private String czytaj(String s) {
		if (!s.equals("")){	
			return s.substring(0, 1);
		}
		return "";
	}
	
	private boolean sprawdzOperator(String o1, String o2) {
		if (o2.equals("")) return false;
		
		//System.out.println("Sprawdzam "+o1+" i "+o2);
		
		if (o2.equals("(") || o2.equals(")") || o2.equals("")) return false;
		
		if(o1.equals("+") || o1.equals("-")) {
			return true;
		}
		if(o1.equals("*") || o1.equals("/")) {
			if (o2.equals("^")) return true;
			if (o2.equals("+") || o2.equals("-")) return false;
			return true;
		}
		
		return false;
	}
	
	public String konwertuj(String wejscie) {
		String wyjscie = "";
		boolean ostatniaToLiczba = false;
		
		while (!czytaj(wejscie).equals("")){
			String c = czytaj(wejscie);
			//System.out.println("Przeczytalem: "+c);
			if (c.equals("0") || c.equals("1") ||c.equals("2") || c.equals("3") || c.equals("4") || c.equals("5") || c.equals("6") || c.equals("7") || c.equals("8") || c.equals("9")) {
				if (ostatniaToLiczba) kolejka.appendToLast(c);
				else kolejka.put(c);
				ostatniaToLiczba = true;
				//System.out.println("Dodaje do kolejki: "+c);
			}
			else if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^") || c.equals("^")) {
				while(sprawdzOperator(c, stos.showLast())) {
					//System.out.println("Dodaje do kolejki: "+stos.showLast());
					
					kolejka.put(stos.get());
				}
				stos.put(c);
				ostatniaToLiczba = false;
			}
			
			else if (c.equals("(")) {
				stos.put(c);
				ostatniaToLiczba = false;
				}
			
			else if (c.equals(")")){
				while (!(stos.showLast().equals("("))){
					kolejka.put(stos.get());
				}
				stos.get();
				ostatniaToLiczba = false;
			}
			wejscie=wejscie.substring(1);
		}
		while (stos.showSize()!=0) kolejka.put(stos.get());
		
		while (kolejka.showSize()!=0) wyjscie = wyjscie + kolejka.get() + " ";
		
		return wyjscie;
	}
	
	
}
