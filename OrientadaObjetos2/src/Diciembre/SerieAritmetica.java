package Diciembre;

public class SerieAritmetica {

	private int primerElemento;
	private int incremento;
	
	
	public SerieAritmetica(int primerElemento,int incremento) {
		
		this.primerElemento=primerElemento;
		this.incremento=incremento;
	}
	
	
	
	
	public int getPrimerElemento() {
		return primerElemento;
	}




	public void Mostrar(int i) {
		int a=primerElemento;
		int j=0;
		while(i>j){
			System.out.println(a);
			a=a+incremento;
			j++;
		}
		
	}
	public int Suma(int i) {
		int suma=0;
		int a=primerElemento;
		int j=0;
		while(i>j){
			
			
			suma=suma+a;
			a=a+incremento;
			j++;
		}
		return suma;
		
	}
	
	
	
	
}
