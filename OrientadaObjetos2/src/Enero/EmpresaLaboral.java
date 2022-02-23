package Enero;

public class EmpresaLaboral {

	public static void main(String[] args) {
		
		
			Coche cocheEmpresaDireccion = new Coche("0000BBB");
			
			Coche cocheEmpresaVentas = new Coche("Seat","Panda","rojo","5566KBG");
			
			cocheEmpresaVentas.imprimeCoche();
			
			System.out.println("Matricula coche del jefe: "+cocheEmpresaDireccion.getMatricula()+ ". Y la matricula del departamento de ventas es: "+cocheEmpresaVentas.getMatricula());
			
			
			
			
	}

}
