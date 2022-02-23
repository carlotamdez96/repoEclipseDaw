package EjemploHerencia;

public abstract class  Cuerpo {

	
	protected float superficie;
	protected float volumen;
	protected Color col;
	
	
	// creo m,ejor el constructor para luego en las clases que heredan simplemente poner super(atrib) en el constructor de los que heredan
	
	public abstract float CalcularSuperficie();
	public abstract float CalcularVolumen();
	
	
	
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public Color getCol() {
		return col;
	}
	public void setCol(Color col) {
		this.col = col;
	}
	@Override
	public String toString() {
		return "Cuerpo [superficie=" + superficie + ", volumen=" + volumen + ", col=" + col + "]";
	}
	
	
	
	
	
}
