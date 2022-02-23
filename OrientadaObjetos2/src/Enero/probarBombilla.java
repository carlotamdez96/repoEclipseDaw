package Enero;

public class probarBombilla {

	public static void main(String[] args) {
		
		
		Bombilla b1 = new Bombilla("salon");
		Bombilla b2 = new Bombilla ("cocina");
		
		b1.enciende();
		b2.enciende();
	    b1.mostrar();
	    b2.mostrar();
	    
	    
	    
	    System.out.println("APAGOOOOON");
	    Bombilla.desactivaGeneral();
	    
	    b1.mostrar();
	    b2.mostrar();

	    
	    b1.apaga();
	    
	    System.out.println("Vuelve la luz");
	    Bombilla.activaGeneral();
	    b1.mostrar();
	    b2.mostrar();
	    
	    
	    
	}

}
