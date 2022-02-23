package Enero;

public class Animal {

	private String nombre;
	private int edad;
	
	public Animal() {
		
	}
	
	
	public void nace() {
		System.out.println("Hola he nacido");
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
