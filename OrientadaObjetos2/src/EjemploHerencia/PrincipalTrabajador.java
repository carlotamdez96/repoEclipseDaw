package EjemploHerencia;

public class PrincipalTrabajador {

	public static void main(String[] args) {
		
		Trabajador trab  = new Trabajador("Juan Granda","332020202");
		
		
		Empleado empleado = new Empleado ("Dolores pons","33209090",36000);
		
		
		Consultor consultor = new Consultor("Juan Granda","332020202",10,55);
		
		
		//System.out.println("Su sueldo es de : "+trab.calcularPaga());
		
		System.out.println("Su sueldo neto es del empleado : "+empleado.calcularPaga());
		
		System.out.println("Su sueldo es del consultor: "+consultor.calcularPaga());
		
		
		System.out.println(trab.toString());
		System.out.println(empleado.toString());
		System.out.println(consultor.toString());
		
		
		if( trab.equals(empleado)) {
			System.out.println("El trabajador es el mismo que el empleado");
		}else {
			System.out.println("El trabajador es distinto al empleado");
		}
		if( trab.equals(consultor)) {
			System.out.println("El trabajador es el mismo que el consultor");
		}else {
			System.out.println("El trabajador es distinto al consultor");
		}
		
		
	}

}
