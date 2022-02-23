package Diciembre;

public class Calentador {
	
	
	private double temperatura;
	private double max;
	private double min;
	private double incremento;
	
	
	public Calentador(double temperatura,double max,double min) {
		this.temperatura=temperatura;
		this.max=max;
		this.min=min;
		this.incremento=5;
		
	}
	
	
	public void Calentar() {
		;
		if((temperatura=temperatura+incremento)>max) {
			max=this.temperatura;
		}
		if ((temperatura=temperatura+incremento)<min){
			min=this.temperatura;
		}
	}
	public void Enfriar() {
		;
		if((this.temperatura=this.temperatura-incremento)>=max) {
			max=this.temperatura;
		}else if((this.temperatura=this.temperatura-incremento)<min) {
			min=this.temperatura;
		}
	
	}



	public void setIncremento(double incremento) {
		
		if(incremento<0 && incremento<max) {
			System.out.println("ERRORRRRRR");
			
		}else {
			this.incremento = incremento;
		}
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void Mostrar() {
		System.out.println("La temperatura es: "+temperatura+" la minima es "+min);
	}
	
	

}
