package EjemploHerencia;

public class Principal {

	public static void main(String[] args) {
		
		
		Circulo c= new Circulo(0,0,0.5);
		Rectangulo r = new Rectangulo(1,3,12,8);
		
		System.out.println("El area del circulo es: "+c.area());
		
		System.out.println("El area del rectangulo es: "+r.area());
		
		c.posicion();
		System.out.println("________________________________________");
		r.posicion();
	}

}
