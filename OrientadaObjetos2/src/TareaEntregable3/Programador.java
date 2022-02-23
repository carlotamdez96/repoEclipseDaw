package TareaEntregable3;

public class Programador extends Empleado {

	

    private boolean tipo;
    private String cual;
    
    public Programador() {
    	
    }
    public Programador(String nombre,int edad,double salario,boolean tipo) {
    	this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		this.tipo=tipo;
		
    }
    

	
	
	private boolean plus() {
		boolean cobrara=true;
		
		if(tipo==true) {
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
		return super.toString()+" clase de programador: "+tipo;
	}
}