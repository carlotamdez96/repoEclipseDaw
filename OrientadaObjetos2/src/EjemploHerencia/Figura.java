package EjemploHerencia;

public abstract class Figura {

	
	
	protected int x;
	protected int y;
	
	
	public Figura(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract double area() ; // es un metodo abstracto, obligo a que todos los metodos que hereden tengan que implementar este metodo
		
	
	
	public void posicion() { // esto se heredara ya implementado y se podra ejecutar desde la principal poniendo el objeto.
		System.out.println("La posicion x es : "+ x);
		System.out.println("La posicion y es : "+ y);
	}
}
