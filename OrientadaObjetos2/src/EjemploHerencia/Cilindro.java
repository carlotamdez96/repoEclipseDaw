package EjemploHerencia;

public class Cilindro extends Cuerpo{

	
	private float radioBase;
	private float altura;
	
	
	public Cilindro(Color col,float radioBase,float altura) {
	
		this.col=col;
		this.radioBase=radioBase;
		this.altura=altura;
	}


	public float getRadioBase() {
		return radioBase;
	}


	public void setRadioBase(float radioBase) {
		this.radioBase = radioBase;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public String toString() {
		return super.toString()+ "radio base: "+ radioBase+" altura: "+altura;
	}
	
	
	
	public float CalcularSuperficie() {
		double sup;
		sup= Math.PI*2*radioBase*(radioBase+altura);
		superficie=(float)sup;
		return (float)sup;
	}
	
	
	public float CalcularVolumen() {
		double vol;
		vol=Math.PI*radioBase*radioBase*altura;
		volumen=(float)vol;
		return (float)vol;
	}
	
}
