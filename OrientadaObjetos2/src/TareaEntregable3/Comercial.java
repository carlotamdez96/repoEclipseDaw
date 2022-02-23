package TareaEntregable3;


public class Comercial extends Empleado{

	private double comision;
	
	
	public Comercial() {
		
	}
	
	public Comercial(String nombre,int edad,double salario,double comision) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		this.comision=comision;
				
	}
	
	
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	
	private boolean plus() {
		boolean cobrara=true;
		
		if(super.getEdad()>30 && (comision>200)) {
			cobrara=true;
		}else{
			cobrara=false;
		}
		return cobrara;
	}
	public  double salarioTotal() {
		
		if(plus()==true) {
			salario=salario+comision+PLUS;
		}else {
			salario=salario+comision;
		}
		return salario;
		
	}
	public  String toString() {
		return super.toString()+" su comision: "+comision;
	}
}
