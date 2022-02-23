package Enero;

public class Moto extends Vehiculo {

	int numerodeplazas;
	
	
	public Moto() {
		super();
		numeroderuedas=2;
		numerodeplazas=1;
	}
	
	public Moto(String matricula,String color, int numeroderuedas,int cilindrada,int potencia,int numerodeplazas) {
		super(matricula,color,numeroderuedas,cilindrada,potencia);// hereda el constructor creado de Vehiculo
		this.numerodeplazas=numerodeplazas; // se le añade este atributo
	}

	public int getNumerodeplazas() {
		return numerodeplazas;
	}

	public void setNumerodeplazas(int numerodeplazas) {
		this.numerodeplazas = numerodeplazas;
	}

/*	@Override
	public String toString() { // reescribo el toString añadiendo el atributo nuevo
		return "Moto [numerodeplazas=" + numerodeplazas + ", matricula=" + matricula + ", color=" + color
				+ ", numeroderuedas=" + numeroderuedas + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
	
	*/
	
	public String toString () {
		return super.toString()+"numero de plazas "+numerodeplazas; // de esta manera hereda de la clase principal el toString y sobreescribe
		
	}
	
	
}
