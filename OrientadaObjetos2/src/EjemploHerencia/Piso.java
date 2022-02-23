package EjemploHerencia;

public class Piso extends Vivienda {

	
	
	private double comunidad;
	private boolean exterior;
	
	public Piso(Tipo TipoVivienda,int numHabitaciones,double metroscuadrados,double precio, String ciudad, String zona, double comunidad,boolean exterior) {
		super(TipoVivienda,numHabitaciones,metroscuadrados,precio,ciudad,zona);
		this.comunidad=comunidad;
		this.exterior=exterior;
		
		

	}
	
	
	
	public double comision1 (double precio) {
		if(metroscuadrados>=100) {
		return precio*3.5/100;
		}else {
			return super.comision(precio);
		}
	}
	
	
	
	public String toString () {
		return super.toString()+"comunidad: "+comunidad+" exterior: "+exterior;
	}
	

	
	
}
