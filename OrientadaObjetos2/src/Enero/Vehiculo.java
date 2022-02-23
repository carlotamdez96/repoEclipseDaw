package Enero;

public class Vehiculo {
	
	protected String matricula;
	protected String color;
	protected int numeroderuedas;
	protected int cilindrada;
	protected int potencia;
	
	
	public Vehiculo() { // Este es el constructor por defecto, que tendra que tener como defecto estos parametros
		matricula="00000XXX";
		numeroderuedas=4;
	
		
	}
	
	public Vehiculo(String matricula, String color, int cilindrada, int potencia, int numeroderuedas) {
		this.matricula=matricula;
		this.color=color;
		this.cilindrada=cilindrada;
		this.potencia=potencia;
		this.numeroderuedas=numeroderuedas;
		
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", cilindrada=" + cilindrada + ", potencia="
				+ potencia + "]";
	}
	
	
	
	
	
	
}
