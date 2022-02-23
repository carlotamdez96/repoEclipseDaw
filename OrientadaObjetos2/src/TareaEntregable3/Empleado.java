package TareaEntregable3;

public abstract class Empleado {

	protected String nombre;
	protected int edad;
	protected double salario;
	final int PLUS= 300;
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract double salarioTotal();
	
	
	public  String toString() {
		return "El nombre es: "+nombre+" ,la edad: "+edad+" ,el salario: "+salario;
	}
	
	
}

