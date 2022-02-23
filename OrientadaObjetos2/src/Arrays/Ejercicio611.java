package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio611 {

	public static void main(String[] args) {
		
		/*Codificar un programa en lenguaje Java que introduzca datos ordenadamente en un vector de 10 elementos
numéricos y realizar un proceso para encontrar un determinado elemento, pedido por teclado, en ese vector ordenado
(búsqueda secuencial en vector ordenado). 


*/
		
		int [] datos = new int [10];
		int i =0;
		int aBuscar;
		int numElementos=datos.length;
		
		Scanner teclado= new Scanner(System.in);
		
		datos[0]=(int)Math.round(Math.random()*(99-1+1)+1);
		
		
		for( i =1; i<datos.length;i++) {
			
		
			while (datos[i]<datos[i-1]) {
				
				datos[i]=(int)Math.round(Math.random()*(99-1+1)+1);
				
			}
			
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
				
				System.out.println("El elemento "+aBuscar+" ha sido encontrado en la posicion: "+i);
			}
			
			
			
		}
		
	}


