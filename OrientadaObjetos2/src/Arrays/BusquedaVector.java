package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaVector {
 // aqui busco vector
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int [] datos = new int [10];
		
		int aBuscar;
		int numElementos=datos.length;
		int i=0;
		int posicion;

		
		for( i =0; i<datos.length;i++) {
			
			
				
				datos[i]=(int)Math.round(Math.random()*(100-1+1)+1);
			
		}
		
		
	System.out.println(Arrays.toString(datos));
	
	
	System.out.println("Dime un numero: ");
	aBuscar= teclado.nextInt();
	
i=0;
		

		
		while (numElementos>i && aBuscar!= datos[i] ) {
			
			i++;
			
		}
		
		if(numElementos==i) {
			System.out.println("Elemento no encontrado");
			
		}else {
			posicion=i;
			System.out.println("El elemento "+aBuscar+" ha sido encontrado en la posicion: "+posicion);
		}
		
		
		
	}
}
