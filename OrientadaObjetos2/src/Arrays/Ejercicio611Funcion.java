package Arrays;
import java.util.*;
public class Ejercicio611Funcion {

	public static void main(String[] args) {
		
		int n;
		Scanner teclado= new Scanner(System.in);
		int [] datos=RellenarArray(); // LLAMO A LA FUNCION PARA RELLENARLO
		
		System.out.println("Dime un numero para buscar: ");
		n=teclado.nextInt();
		
		System.out.println("La posicion del numero: "+n+" es: "+PosicionNumBuscado(n,datos));
		
	}
	
	// ESTAS SON LAS FUNCIONES 
	
	// va a devolver un vector enronces ponemos el tipo[]
	public static int[] RellenarArray() { // LA LLAMO Y M DEVUELVE UN ARRAY YA RELLENADO
		int [] datos = new int [10];
		
		datos[0]=(int)Math.round(Math.random()*(99-1+1)+1);
			
			
			for(int  i =1; i<datos.length;i++) {
				
			
				while (datos[i]<datos[i-1]) {
					
					datos[i]=(int)Math.round(Math.random()*(99-1+1)+1);
					
				}
				
		}
			
			System.out.println(Arrays.toString(datos));
			return datos; // devolvemos simplemente el nombre del vector declarado
	}
	
	
	
	
	 // SIGUIENTE FUNCION QUE DEVEULVE LA POSICION EN EL ARRAYS DEL NUMERO QUE BUSCAMOS
	public static int PosicionNumBuscado(int aBuscar,int [] d) { // LE PASO UN ELEMENTO Y EL ARRAY YA CREADO Y PIDO Q ME BUSQUE UN NUM
		
		
		int numElementos=d.length;
		int i=0;
	
		
		while (numElementos>i && aBuscar!= d[i] ) {
			
			i++;
			
		}
		
		if(numElementos==i) {
			System.out.println("Elemento no encontrado");
			return -1;
			
		}else {
			
			return i;
		}
	}

}
