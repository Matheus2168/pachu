package Lab4;

import Lab4.ONPGenerator;

public class main {

	public static void main(String[] args) {
		
		ONPGenerator o = new ONPGenerator();
		System.out.println(o.konwertuj("(2+3)*5"));
		System.out.println(o.konwertuj("((2+7)/3+(14-3)*4)/2"));
		System.out.println(o.konwertuj("3+4*2/(1-5)^2"));
		System.out.println(o.konwertuj("(6-3)^2-11"));
		System.out.println(o.konwertuj("162/(2+1)^4"));
		
		Drzewo Tree = new Drzewo();
        Wezel root = new Wezel(15);
        Tree.Root = root;
        root.Lewy = new Wezel(12);
        root.Prawy = new Wezel(40);
        root.Prawy.Prawy = new Wezel(21);
        root.Prawy.Lewy = new Wezel(22);
        root.Lewy.Prawy = new Wezel(23);
        root.Lewy.Lewy = new Wezel(24);
        root.Prawy.Prawy.Prawy = new Wezel(31);
        root.Prawy.Prawy.Lewy = new Wezel(32);
        root.Prawy.Lewy.Lewy = new Wezel(33);

        Tree.PrintTree();
        
        
        System.out.println("");
        

	}

}
