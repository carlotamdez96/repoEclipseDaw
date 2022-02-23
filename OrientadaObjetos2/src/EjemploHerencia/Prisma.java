package EjemploHerencia;

public class Prisma extends Cuerpo {

	
	
	private float ladoBase;
	private float altura;
	
	
	public Prisma(Color col,float ladoBase,float altura) {
	 // si hubiera creado el constrctor aqui seria super(col);
		this.col=col;
		this.ladoBase=ladoBase;
		this.altura=altura;
		
	}


	public float getLadoBase() {
		return ladoBase;
	}


	public void setLadoBase(float ladoBase) {
		this.ladoBase = ladoBase;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	public String toString() {
		return super.toString()+" lado de la base: "+ladoBase+" altura: "+altura;
		
	}
	
	
	public float CalcularSuperficie() {
		double sup;
		sup=4*ladoBase*altura+2*ladoBase*ladoBase;
		superficie=(float)sup;
		return (float)sup;
	}
	
	public float CalcularVolumen() {
		double vol;
		vol=ladoBase*ladoBase*altura;
		volumen=(float)vol;
		return (float)vol;
	}
	
	
	
	
	
	
	
}
