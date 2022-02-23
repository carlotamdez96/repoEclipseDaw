package Febrero;

public abstract class Instrumento {

	// public enum Nota{DO,RE,MI,FA,SOL,LA,SI} otra manera de poner el enumerado
	protected Notas [] notas = new Notas [100];
	protected int i=0;

	
	//OTRA MANERA
	// static protected int TAM_MAX_TABLAA = 100; ESTO SERIA EL MAXIMO DE NOTAS
	// protected Notas[];
	// protected int num;
	
	
	public Notas[] getNotas() {
		return notas;
	}


	public void setNotas(Notas[] notas) {
		this.notas = notas;
	}


	public void añadirNotas (Notas a) {
			
			notas[i]=a; 
			
				if(i<100) {
				i++;
				
				}else {
					System.out.println("No entran mas");
				}
				
				/* if (numNotas < notas.length){
				 *  notas[numNotas]=n;
				 *  numNotas++;
				 *  }
				 * 
				 * 
				 */

	}
	
	
	public void eliminarNotas () {
	
		
		
		i--; // numNotas--;
		
	}
	
	
	public abstract void interpretacion ();
	
	
}
