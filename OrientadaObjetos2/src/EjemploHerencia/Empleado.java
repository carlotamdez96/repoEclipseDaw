package EjemploHerencia;

public class Empleado extends Trabajador {

	

	public Empleado() {
		
	}
	
	public Empleado(String nombre,String nss,float sueldo) {
		super(nombre, nss);
		this.sueldo=sueldo;
		super.direccion="calle no hay ....";
		super.puesto="auxiliar";
		super.telefono="0000000";
	
	}
	
	public float calcularPaga() {
		super.impuesto=19;
		super.numpagas=14;
		return  super.calcularPaga();
	}
	
	public String toString() {
		return super.toString()+" Sueldo Base: "+sueldo;
	}
	
	
	/*public boolean equals(Empleado e) {
		return super.equals(e);
	}*/
	
}
