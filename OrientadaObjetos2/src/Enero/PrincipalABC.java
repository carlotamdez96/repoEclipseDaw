package Enero;

public class PrincipalABC {

	public static void main(String[] args) {
		
		
		
		B b= new B();
		C c= new C();
		
		
		b.metodo1();// este metodo esta heredando de la clase A dentro de la clase B, por eso podemos utilizarlo
		b.metodo2(); // este lo defini en la clase B, que "Hereda"de A porque es el meotod abstracto, entonces al crear la clase B con el extends de la clase b
					// tengo que incluir ese metodo si o si
		
		c.metodo1(); // este metodo existe porque se ha Heredado de la clase A, dentro de la clase c
		c.metodo2();

	}

}
