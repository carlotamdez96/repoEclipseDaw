package EjemploHerencia;

import java.util.Objects;

public class Trabajador {

	protected String nombre;
	protected String puesto= "Administrador";
	protected String direccion= "c/hola";
	protected String telefono="77898090";
	protected String nss;
	protected float sueldo;
	protected float impuesto=21;
	protected int numpagas=12;
	
	
	public Trabajador() {
		
	}
	public Trabajador(String nombre,String nss) {
		this.nombre=nombre;
		this.nss=nss;
		
		
	}
	
	
	
	 
	 
	 
	public float calcularPaga() {
		
		
		return (sueldo*(1-(impuesto/100)))/numpagas;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", nss=" + nss + ", impuesto=" + impuesto + "]";
	}
	
	
	public boolean equals(Trabajador T) {
		if(this.nss==T.nss) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}
