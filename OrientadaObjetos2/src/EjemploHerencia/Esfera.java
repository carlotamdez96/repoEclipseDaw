package EjemploHerencia;

public class Esfera extends Cuerpo {

	private float radio;
	
	public Esfera(Color col,float radio) {
		//super(col) deberia crear un constructor con solo el color
		this.col=col;
		this.radio=radio;
	}
	
	
	public float CalcularSuperficie() {
		double sup;
		sup=(double)4*Math.PI*Math.pow(radio, 2);
		superficie=(float)sup;
		return (float)sup;
		
	}
	
	
	public float CalcularVolumen() {
		double vol;
		vol=(4/3)*Math.PI*Math.pow(radio, 3);
		
		volumen=(float)vol;// si hubiera mas atributos llamados volumen, poner super.volumen, para saber que me refiero al atrib del padre
		return (float)vol;
	}
	
	
	public float getRadio() {
		return radio;
	}




	public void setRadio(float radio) {
		this.radio = radio;
	}




	public String toString() {
		return super.toString()+" radio= "+radio;
	}
	
	
}
