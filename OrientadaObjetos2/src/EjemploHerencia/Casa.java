package EjemploHerencia;

public class Casa extends Vivienda {

	private double parcela;
	private boolean piscina;
	
	// recordar poner el tipoVivienda del Tipo que es, que es enumerada y se llamo Tipo
	
	public Casa(Tipo TipoVivienda,int numHabitaciones,double metroscuadrados,double precio, String ciudad, String zona, double parcela,boolean piscina) {
		super(TipoVivienda,numHabitaciones,metroscuadrados,precio,ciudad,zona);
		
		this.parcela=parcela;
		this.piscina=piscina;
	}
	
	public String toString() {
		return super.toString()+" parcela: "+parcela+" piscina: "+piscina;
	}
	
	public boolean equals(Casa c) {
		if(super.equals(c) && this.parcela==c.parcela && this.piscina==c.piscina) {
			return true;
		}else {
			return false;
		}
	}
	
}
