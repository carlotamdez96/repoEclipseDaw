package EjemploHerencia;

public class Consultor extends Trabajador{

	
	private int numhoras;
	private float tarifa;
	
	public Consultor() {
		
	}
	public Consultor(String nombre,String nss,int numhoras,float tarifa) {
		super(nombre, nss);
		this.numhoras=numhoras;
		this.tarifa=tarifa;
		super.puesto="Consultor";
		super.direccion="jeje";
	}
	
	
	public float calcularPaga() {
		
		super.impuesto=0;
		super.numpagas=1;
		float sueldo;
		sueldo=numhoras*tarifa;
		return sueldo;
		
	}
	
	public String toString() {
		return super.toString()+" horas: "+numhoras+" ,tarifa/hora: "+tarifa;
	}
}
