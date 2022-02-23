package Arrays;
import java.util.Scanner;
public class Ejemplo2 {

	public static void main(String[] args) {
		
		String []cadenas = new String [4];
		Scanner teclado= new Scanner (System.in);
		
		
		
		
		//en un bucle for leemos una cadena en cada pasada
		
		for(int i=0; i<cadenas.length; i++) {
			System.out.println("Introduce la cadena["+i+"]= ");
			cadenas[i]=teclado.nextLine();
		}
		
		
		
		
		
		//recorremos el array y mostramos sus valores
		System.out.println("Las cadenas introducidas son: ");
		for(String c:cadenas) {
			System.out.print(" "+c+" ");
		}
		
	}

}
