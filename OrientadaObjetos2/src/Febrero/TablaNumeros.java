package Febrero;
import java.util.*;
public class TablaNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] array = new int [10];
		int [] aux = new int [10];
		
		int numerosT=0;
		int numN;
		int posicion;
		
		for(int i=0;i<8;i++) {
		System.out.println("Dime un numero");
		array[i]= teclado.nextInt();
		}
	
		
		System.out.println("Dime un numero");
		numN= teclado.nextInt();
		System.out.println("En que posicion quieres insertarlo");
		posicion= teclado.nextInt();
		
		System.out.println(Arrays.toString(array));
		for(int i=0; i<=posicion;i++) {

			if(i== posicion) {
				array[i+1]=array[i];
			}
			
		}
		
		array[posicion]= numN;
		System.out.println(Arrays.toString(array));
	}

}
