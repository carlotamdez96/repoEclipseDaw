package Enero;

public class Coche1 extends Vehiculo  {

	int numerodepuertas;
	
	
	public Coche1() {
		super();
	}
	public Coche1(String matricula, String color, int cilindrada, int potencia, int numerodepuertas,int numeroderuedas) {
		super(matricula,color,cilindrada,potencia,numeroderuedas); // porque hereda asi,el constructor de la clase Vehiculo
		this.numerodepuertas=numerodepuertas; // y ademas le añado este atributo
	}
	public int getNumerodepuertas() {
		return numerodepuertas;
	}
	public void setNumerodepuertas(int numerodepuertas) {
		this.numerodepuertas = numerodepuertas;
	}
	/*@Override
	public String toString() {
		return "Coche1 [numerodepuertas=" + numerodepuertas + ", matricula=" + matricula + ", color=" + color
				+ ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
		}
		*/
	
	
	public String toString() {
		return super.toString()+" "+"numero de puertas: "+numerodepuertas;
	}
		
	
	
	
}
