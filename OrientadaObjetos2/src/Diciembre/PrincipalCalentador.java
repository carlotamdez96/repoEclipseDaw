package Diciembre;

public class PrincipalCalentador {

	public static void main(String[] args) {
		
		Calentador a=new Calentador(15,0,22);
		
		System.out.println(a);
		a.Mostrar();
		a.Calentar();
		a.Mostrar();
		a.setIncremento(10);
		a.Enfriar();
		a.Mostrar();
		
	}

}
