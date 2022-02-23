package TareaEntregable3;

public class Analista extends Empleado {

	
	enum tipoProyecto {InteligenciaArtificial,Administracion,BigData,Turismo};// definicion del tipo
	tipoProyecto tipo;// declaracion del atributo
	
	public Analista() {
		
	}
	
	public Analista(String nombre,int edad,double salario,tipoProyecto tipo) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		this.tipo=tipo;
		
	}
	public tipoProyecto getTipo() {
		return tipo;
	}
	public void setTipo(tipoProyecto tipo) {
		this.tipo = tipo;
	}
	
	
	private boolean plus() {
		boolean cobrara=true;
		
		if(super.getEdad()<35 && (tipo==tipoProyecto.BigData || tipo==tipoProyecto.InteligenciaArtificial)) {
			cobrara=true;
		}else{
			cobrara=false;
		}
		return cobrara;
	}
	public  double salarioTotal() {
		
		if(plus()==true) {
			salario=salario+PLUS;
		}else {
			salario=salario;
		}
		return salario;
		
	}
	
	public String toString() {
		return super.toString()+" tipo de proyecto: "+tipo;
	}
}
